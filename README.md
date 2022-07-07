# JDBC (stands for - Java DataBase Connectivity)
- Techology used to connect java application with database.
- JDBC is a Java API(means application programming interface (API) for the programming language Java) to connect and perform operations(insert,delete,update,select,etc) with the Database.
- Now question arise that how does JDBC connect with database? 
- Answer is JDBC API uses "JDBC-drivers" to connect with the database.Jar file hota h jisko hum download krke load krte h.

### Steps to connect java with any databases ;

**1) import the package.** 

         eg: java.sql.*

**2)** • a. Load the driver.   

         eg: com.mysql.jdbc.driver

    • b. Register the driver.
   
         eg: Class.forName(com.mysql.jdbc.driver)

**3) Establish the Connection.**

         eg: using DriverManager

**4) Create the Statement.**

         Statements are of 3 typyes : Normal Statement , Prepared Statement and Callable Statement. 
         
- **STATEMENT** : The Statement interface represents the static SQL statement.
- **PREPARED** : This interface extends the Statement interface. In which SQL statement can be executed multiple times.
- **CALLABLE** : The CallableStatement interface provides methods to execute stored procedures.


**5) Execute the Query.**

         eg: by using any statement from step 4

**6) Process Result.**     

         eg:ResultSet

**7) close.**

         st.close();

         con.close(); 

### Synatx of all above steps :

         1) import java.sql.*

         2-a) main()
            {
           b) Class.forName(com.mysql.jdbc.driver)

         3) Connection con = DriverManager.getConnection("URL","UserName","Password");

         4) Statement st = con.createStatement();

         5) ResultSet rs = st.executeQuery("select * from student");

         6) while(rs.next())
            {
             System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

         7) st.close();

            con.close(); 


# JDBC - School Management System to add/update/delete students.

**Java Application used :**
    
      Eclipse IDE
      
**Database used :**   

       MySql

- **steps 1: creating new database and named as "student_manage"**

![sql1(creating database)](https://user-images.githubusercontent.com/101108540/177479283-d6958b90-6156-4614-984c-93659dc4eeb2.jpg)


- **steps 2 To view all databases present in my device.**

![sql2(to seeing all database which is present in my device)](https://user-images.githubusercontent.com/101108540/177496541-17baf3f1-4c85-443e-8fd7-ea17c7a510bb.jpg)

- **steps 3: To perform crud operations or anything with database .,first we have to use databse.**

![sql3(to perform crud or anything we have to use database)](https://user-images.githubusercontent.com/101108540/177479822-9dd4ac00-8b82-483b-8926-854e16062de2.jpg)

- **steps 4: lets create new table and named as students.**

![sql4(creating table named as students)](https://user-images.githubusercontent.com/101108540/177479919-692c9589-d29a-4612-9eb8-c12084a6f4e3.jpg)

- **steps 5: To check table is created or not write show tables;**

![sql5(to display the content of table we have to use show table)](https://user-images.githubusercontent.com/101108540/177497035-49d7108a-878e-4927-8187-325439d0406e.jpg)

- **steps 6: After creating and checking table lets display(describe) the content of tables.**

![sql6(describing table)](https://user-images.githubusercontent.com/101108540/177497387-2f5cf78f-cd30-4962-890c-295dfcc7a1ea.jpg)

- **steps 7: Table content is empty because we haven't added student yet. so lets add new student from java application and see that it will store and appear in our database or not.**

![2](https://user-images.githubusercontent.com/101108540/177504321-c04e6166-9983-46b0-ad93-3aa35a175842.jpg)

- **steps 8: yaaa its working ツ**

![sql7(OUTPUT)](https://user-images.githubusercontent.com/101108540/177498837-a08a19ee-4f70-45d6-a4e8-c86c7ae1ddd3.jpg)

- **steps 9: now lets try to add another new students.**

![3](https://user-images.githubusercontent.com/101108540/177503384-2025597d-6197-4eb0-9af4-235cb3575f25.jpg)

- **steps 10: see its working ツ**

![sql8(OUTPUT2)](https://user-images.githubusercontent.com/101108540/177503557-43bd8197-372a-4040-837b-883b883544a6.jpg)

- **steps 11: To display students detail in Java appliaction only instead of mysql.**

![sql10(displaying all the studing in eclipse)](https://user-images.githubusercontent.com/101108540/177504576-70e21278-08fc-4655-a2d0-aa022325f7a9.jpg)

- **steps 12: Exit㋡**

![sql9(Exit)](https://user-images.githubusercontent.com/101108540/177504667-dd48cca3-385f-45c1-b6fe-50e83312abca.jpg)

