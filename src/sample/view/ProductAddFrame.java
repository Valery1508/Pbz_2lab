package sample.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import sample.controller.ProductController;

import java.sql.SQLException;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ProductAddFrame {
    private ProductController productController;
    public HBox form;
    public VBox allElements;
    private TextField textFieldCodeP, textFieldNameP;
    private ComboBox<String> categoryComboBox;

    public ProductAddFrame() {
        productController = new ProductController();
    }

    protected VBox addProduct() throws SQLException, ClassNotFoundException {
        Label addingLabel = new Label("Adding new product");
        addingLabel.setFont(Font.font(20));

        textFieldCodeP = new TextField();
        textFieldCodeP.setPromptText("Product code(e.g. 73891)");

        textFieldNameP = new TextField();
        textFieldNameP.setPromptText("Product name");

        ObservableList<String> categories = FXCollections.observableArrayList(productController.getCategoryList()); //ошибка
        categoryComboBox = new ComboBox<String>(categories);
        categoryComboBox.setValue("Продовольственный");

        Button addButton = new Button("ADD");

        actions(addButton);

        form = new HBox();
        form.getChildren().addAll(textFieldCodeP, textFieldNameP, /*textFieldCategory*/categoryComboBox);
        form.setSpacing(10);

        allElements = new VBox();
        allElements.getChildren().addAll(addingLabel, form, addButton);
        allElements.setSpacing(10);

        return allElements;
    }

    public void actions(Button addButton){
        addButton.setOnAction(actionEvent -> {
            if(!textFieldCodeP.getText().equals("") && !textFieldNameP.getText().equals("")){
                try {
                    productController.addProduct(parseInt(textFieldCodeP.getText()), textFieldNameP.getText(), categoryComboBox.getValue());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Product added successfully!");
                alert.showAndWait();
            }
            else {
                if (textFieldCodeP.getText().equals("") || !textFieldNameP.getText().equals("")){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Fill in the fields correctly!");
                    alert.showAndWait();
                }
            }
        });
    }
}
