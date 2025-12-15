public class Inventario {

    private int contadorMascotas = 0;
    private Mascotas [] mascotasRegistradas;

    public Inventario(int contadorMascotas, Mascotas[] animales) {
        this.contadorMascotas = contadorMascotas;
        this.mascotasRegistradas = new Mascotas[30];
    }

    public int getContadorMascotas() {
        return contadorMascotas;
    }

    public Mascotas[] getMascotasRegistradas() {
        return mascotasRegistradas;
    }
    //Metodo para insertar Mascota

    public boolean registrarMascota(Mascotas m){
        boolean resultado = false;
        if(m != null){
            int index = -1;
            for (int i = 0; i < this.contadorMascotas; i++){
                if (this.mascotasRegistradas[i].getNombre().equalsIgnoreCase(m.getNombre())){
                    index = i;
                    break;
                }

            }
            if(index == -1){
                this.mascotasRegistradas[this.contadorMascotas] = m;
                this.contadorMascotas++;
                resultado = true;
            }
        }
        return resultado;

    }
    public boolean eliminarMascota(String nombre) {
        boolean resultado = false;
        int index = -1;

        for (int i = 0; i < this.contadorMascotas; i++) {
            if (this.mascotasRegistradas[i] != null) {
                if (this.mascotasRegistradas[i].getNombre().equalsIgnoreCase(nombre)) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1){
            this.mascotasRegistradas[index] = this.mascotasRegistradas[contadorMascotas - 1];
            this.mascotasRegistradas[contadorMascotas - 1] = null;
            contadorMascotas--;
            resultado = true;
        }

        return resultado;
    }
    public void mostrarAnimal(String nombre) {
        for (int i = 0; i < contadorMascotas; i++) {
            if (mascotasRegistradas[i].getNombre().equalsIgnoreCase(nombre)) {
                mascotasRegistradas[i].info();
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public void mostrarTodos() {
        for (int i = 0; i < contadorMascotas; i++) {
            mascotasRegistradas[i].info();
        }
    }




}

