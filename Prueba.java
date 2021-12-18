import javax.swing.*;

public class Prueba {

    public static void main(String[] args) {

        Encapsulamiento encapsulamiento = new Encapsulamiento();
        encapsulamiento.setClaveAcceso("usuario conectado...");
        System.out.println(encapsulamiento.getClaveAcceso());


        Criptografia criptografia = new Criptografia();
        String pSecreta = JOptionPane.showInputDialog("Ingrese palabra, palabras o texto para encriptar mensaje");
        System.out.println(criptografia.encriptacion(pSecreta));
        System.out.println("La palabra ingresada fue: solo es informativo para validar la palabra correcta al usar el segundo metodo: " + pSecreta);


        String usuario = JOptionPane.showInputDialog("Ingrese su usuario para desencriptar el codigo");

        if (usuario.equals("superUsuario")) {

            String secreta = JOptionPane.showInputDialog("copie y pegue aqui la palabra secreta para desencriptar");
            System.out.println(criptografia.desEncriptacion(secreta));

        } else {

            System.out.println("No tienes permiso para acceder a la primera capa para "
                    + " por fallas de usuario");

        }

        {

        }

    }
}
