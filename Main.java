public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        trabajador.setAge(42);
        System.out.println("Su edad es: " + trabajador.getAge());
        trabajador.setName("Julius Novachrono");
        System.out.println("Su nombre es: " + trabajador.getName());
        trabajador.setPhone("8173533777");
        System.out.println("Su número de teléfono es: " + trabajador.getPhone());
        trabajador.setSalario(7300);
        System.out.println("Su salario es de " + trabajador.getSalario() + " dólares al mes");
    }
   
    static class Persona {
        private int age;
        private String name;
        private String phone;

        public void setAge(int age){

            this.age = age;

        }

        public int getAge(){
            return this.age;
        }

        public void setName(String name){

            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public void setPhone(String phone){
            this.phone = phone;
        }

        public String getPhone(){
            return this.phone;
        }

    }
    final static class Cliente extends Persona{
        private float credito;
        public void setCredito(float credito){
            this.credito = credito;
        }

        public float getCredito(){
            return this.credito;
        }
    }
    static class Trabajador extends Persona{
        private float salario;
        public void setSalario(float salario){
            this.salario = salario;
        }

        public float getSalario(){
            return this.salario;
        }
    }
}