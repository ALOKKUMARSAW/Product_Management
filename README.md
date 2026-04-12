📦 Product Management System

A full-stack Product Management System built using Spring Boot to manage products efficiently with REST APIs.

🚀 Features
➕ Add new products
📋 View all products
✏️ Update product details
❌ Delete products
🔍 Search products
⚡ RESTful API architecture
🛠️ Tech Stack
Backend: Java, Spring Boot, Spring MVC, Spring Data JPA
Database: MySQL / H2
Tools: Postman, Maven, Git
📂 Project Structure
product-management/
│── controller/
│── service/
│── repository/
│── model/
│── resources/
│── pom.xml
⚙️ API Endpoints
Method	Endpoint	Description
GET	/viewAllProducts	Get all products
POST	/addProduct	Add new product
🧪 Sample Request
{
  "name": "shampoo",
  "description": "mildy shampoo",
  "price": 45121,
  "photoUrl": "shampoo url"
}
📸 API Testing (Postman)
🔹 Add Product API

🔹 View All Products API

⚡ Getting Started
1. Clone Repository
git clone https://github.com/ALOKKUMARSAW/Product_Management.git
cd Product_Management
2. Configure Database
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3. Run Application
mvn spring-boot:run
📈 Future Enhancements
🔐 JWT Authentication
📊 Dashboard
🛒 E-commerce integration
👨‍💻 Author

Alok Kumar Saw
🔗 GitHub: https://github.com/ALOKKUMARSAW

⭐ Support

If you like this project, give it a ⭐ on GitHub!
