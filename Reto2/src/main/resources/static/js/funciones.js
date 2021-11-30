/**
 * Función para el botón login, primero evalua si los campos email y contraseña están vacios
 * de ser así, envía una alerta al usuario solicitando el ingreso del usuario y contraseña.
 * Después se realiza la petición para iniciar sesión y se imprimen los datos
 * del usuario en consola. Finalmente redirecciona a la ventana de productos donde el usuario
 * puede agregar un nuevo producto o dar clic en registro usuario para registrar un usuario
 */
$("#login").click(function(){

    if($.trim($("#email").val()) == "" || $.trim($("#password").val()) == ""){
        alert("Por favor ingrese usuario y contraseña")
    } else {
        let datos = {
            email: $("#email").val(),
            password: $("#password").val()
        }
        $.ajax({
            url:"http://localhost:8080/api/user/" + datos.email + "/" + datos.password,
            method: "GET",
            dataType: "json",
            success:function(response){
                console.log(response);
                alert("Bienvenido")
                borrarIngreso();
                window.location.href = "http://localhost/Ciclo4/Reto2%20front/productos.html";
            }
        });
    }
});

/**
 * Función que borra los campos de texto en el formulario
 */
function borrarIngreso(){
    $("#email").val("");
    $("#password").val("");
}