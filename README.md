# WebHomework

Web App Assignment
Continue working on the project started in class. Take archive WebProjectV2.zip -> unzip and add project in IntelliJ. 

I. Implement validations for customer edit page
 - phone number should start with 00 or + then followed by a minimum of 2 digits
- throw an exception from the update method in the service (with an appropriate message)
- catch the exception in controller and add the error to the model

II. Update the model classes:

    1. Customer -> add a property List<Order> orders;

    2. Update Order & Product classes with all properties, setters and getters

    3. Create a new entity OrderProduct -> to create the link between Orders and Products

    4. Add in Order a new property List<OrderProducts> orderProducts
