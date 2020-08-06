<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit product</title>
</head>
<body>
<form method="post">
    <input type="hidden" value="${product.id}" name="id"/>
    <label>Name</label>
    <input name="name" value="${product.name}"/> <br><br>
    <label>Price</label><br>
    <input name="price" value="${product.price}" type="number" min="100"/>
    <input type="submit" value="Send">
</form>

</body>
</html>