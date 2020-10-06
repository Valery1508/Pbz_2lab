## ПБЗ, 2 лабораторная работа, 10 вариант
## 821701, Зубрицкая Валерия Геннадьевна

# Тема : Учёт спроса и предложения

## Словесное описание предметной области: 
Отдел маркетинга предприятия занимается спросом выпускаемого товара. 
Каждый товар характеризуется кодом, названием, категорией (промышленные, бытовые, торговое оборудование и т.п.). 
Продажа товара на предприятии осуществляется по накладным, в которых указано кому отправлен товар (юридическое или физическое лицо, название, имя, адрес, номер, серия документа, банковские реквизиты (номер и название банка). 
В накладной также указывается отпускная цена на текущую дату, количество отпущенного товара. Необходимо отслеживать название населенных пунктов, название региона Беларуси и страны ближнего или дальнего зарубежья куда отправлен товар. 
Каждая накладная соответствует одному пункту назначения и одному покупателю. 

## Необходимо реализовать выполнения следующих функций:
-	Добавление/редактирование/удаление информации о товарах.
-	Добавление/редактирование/удаление информации о накладных.
-   Просмотр списка покупателей, сделавших покупку на максимальную сумму на выбранную дату – дата, название покупателя, адрес, сумма покупки.
-	Просмотр списка изменений стоимости заданного товара за указанный период времени (название предприятия, производящего товар, наименование товара, дата, стоимость).
-	Просмотр списка существующих категорий товаров.

## Схема базы данных
![](docs/schema.png)

## Технические детали
1. Java8 + JavaFX
2. MySQL
3. JDBC