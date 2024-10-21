//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil benz = new Automovil("Mercedes","gla240"); // java crea su propio constructor cuando no existe, este es de foma implicita
        //benz.setMarca("Merecedes");
        benz.setModelo("GLA240");
        benz.setColor("Plateado");
        benz.setCilindraje(2000);

        System.out.println("benz = " + benz.verDetalle());

        Automovil benz2 = new Automovil("mercedes","gla250");
        benz2.setMarca("Merecedes");
        benz2.setModelo("GLA240");
        benz2.setColor("Plateado");
        benz2.setCilindraje(2000);

        System.out.println("benz = " + benz2.verDetalle());


        // crear una clase llamada jugador, e esa clase poner al mmenos 6 atributos, crear metodos setter y getter, crear propios metodos y desplegar alineacion


    }
}