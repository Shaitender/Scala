Problem Scenario 85 : In Continuation of previous question, please accomplish following activities. 
1. Select all the columns from product table with output header as below. 
productiD AS ID 
code AS Code 
name AS Description 
price AS ‘unit Price' 
2. Select code and name both separated by ' - ' and header name should be 'product Description'. 
3. Select all distinct prices. 
4. Select distinct price and name combination. 
5. Select all price data sorted by both code and productlD combination. 

6. count number of products. 
7. Count number of products for each code. 
=================================================================== 
Solution : 
Step 1 : Select all the columns from product table with output header as below. 
productiD AS ID 
code AS Code 
name AS Description 
price AS 'unit Price' 



val results = sqlcontext.sql( "SELECT productiD AS ID, code AS code, name AS Description, price AS unit_price FROM products ORDER BY ID") 
results.show() 
Step 2 : Select code and name both separated by ' - ' and header name should be 'product Description'. 
val results = sqlcontext.sql("SELECT CONCAT(Code, '-', name) AS ‘product Description', price FROM products") 
results.show() 
Step 3 : Select all distinct prices. 
val results = sqlcontext.sql("SELECT DISTINCT price AS Distinct_Price FROM products")
results.show() 
Step 4 : Select distinct price and name combination. 
val results = sqlcontext.sql(" SELECT DISTINCT price, name FROM products") 
results.show() 
Step 5 : Select all price data sorted by both code and productlD combination. 
val results = sqlcontext.sql("SELECT* FROM products ORDER BY code, productiD") 
results.show() 
Step 6 : count number of products. 
val results = sqlcontext.sql("SELECT COUNT(1) AS total_count FROM products") 
results.show() 
Step 7 : Count number of products for each code. 
val results = sqlContext.sql("SELECT code,COUNT(1) FROM products GROUP BY code ORDER BY count DESC") 
results.show() 
val results = sqlContext.sql("SELECT code,COUNT(1) AS count FROM products GROUP BY code ORDER BY count DESC")
results.show() 
