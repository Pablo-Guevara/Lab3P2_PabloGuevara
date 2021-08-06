package lab3p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_PabloGuevara {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String usuario, contraseña;

        //ENTIDADES
        String nombre, apellido, ID, usuarioG, contraseñaG;
        //ADMIN
        String puesto;
        int añosCargo, añosExpVentas;
        double salarioBase;
        //Programador
        String lenguajePrograDomina, horario;
        //Motoristas
        double comisiones = 0;
        String medioTransporte;
        int cantMaxEncargos;
        //Cliente
        String domicilio;
        int cantVecespedido = 0;
        //Restaurante
        String nombreR, ubicacion, RTN, slogan;
        //Comidas
        String nombreC;
        double precio;
        int cantAcompa;
        //Acompañamientos
        String nombreAcompañamiento, tipo;
        double precioAdicional;
        //Tienda
        String nombreT, ubicacionT;
        int cantEmpleados;
        double tiempoEsperaPreparacionMinutos;
        //Articulos
        String nombreA, categoria;
        double precioA;

        int opc1 = 0;
        boolean ciclo = true;

        ArrayList<entidades> listaEntidades = new ArrayList();
        ArrayList<restaurante> listaRestaurantes = new ArrayList();
        ArrayList<comida> listaComidas = new ArrayList();
        ArrayList<acompañamiento> listaAcompañamientos = new ArrayList();
        ArrayList<tienda> listaTiendas = new ArrayList();
        ArrayList<articulos> listaArticulos = new ArrayList();

        while (ciclo == true) {
            System.out.println("-----Bienvenido-----");
            System.out.println("Ingrese su nombre de usuario: ");
            usuario = leer.next();
            System.out.println("Ingrese su contraseña: ");
            contraseña = leer.next();

            if (usuario.equals("david") && contraseña.equals("1234")) {
                while (opc1 != 36) {
                    System.out.println("----MENU----");
                    System.out.println("1-Crear administrador");
                    System.out.println("2-Crear programador");
                    System.out.println("3-Crear motorista");
                    System.out.println("4-Crear cliente");
                    System.out.println("5-Crear restaurante");
                    System.out.println("6-Crear comida");
                    System.out.println("7-Crear acompañamiento");
                    System.out.println("8-Crear tienda");
                    System.out.println("9-Crear articulo");
                    System.out.println("10-Mostrar administradores");
                    System.out.println("11-Mostrar programadores");
                    System.out.println("12-Mostrar motoristas");
                    System.out.println("13-Mostrar clientes");
                    System.out.println("14-Mostrar restaurantes");
                    System.out.println("15-Mostrar comidas");
                    System.out.println("16-Mostrar acompañamientos");
                    System.out.println("17-Mostrar tiendas");
                    System.out.println("18-Mostrar articulos");
                    System.out.println("19-Eliminar una entidad");
                    System.out.println("20-Eliminar restaurante");
                    System.out.println("21-Eliminar comida");
                    System.out.println("22-Eliminar acompañamiento");
                    System.out.println("23-Eliminar tienda");
                    System.out.println("24-Eliminar articulo");
                    System.out.println("36-Salir");
                    opc1 = leer.nextInt();
                    if (opc1 == 1) {
                        System.out.println("Ingrese nombre: ");
                        nombre = leer.next();
                        System.out.println("Ingrese apellido: ");
                        apellido = leer.next();
                        System.out.println("Ingrese ID: ");
                        ID = leer.next();
                        System.out.println("Ingrese usuario: ");
                        usuarioG = leer.next();
                        System.out.println("Ingrese contraseña: ");
                        contraseñaG = leer.next();
                        System.out.println("Ingrese puesto de trabajo: ");
                        puesto = leer.next();
                        System.out.println("Ingrese años en el cargo: ");
                        añosCargo = leer.nextInt();
                        System.out.println("Ingrese salario base: ");
                        salarioBase = leer.nextDouble();
                        System.out.println("Ingrese años de experiencia en ventas: ");
                        añosExpVentas = leer.nextInt();

                        listaEntidades.add(new administradores(puesto, añosCargo, salarioBase, añosExpVentas, nombre, apellido, ID, usuarioG, contraseñaG));
                    }
                    if (opc1 == 2) {
                        System.out.println("Ingrese nombre: ");
                        nombre = leer.next();
                        System.out.println("Ingrese apellido: ");
                        apellido = leer.next();
                        System.out.println("Ingrese ID: ");
                        ID = leer.next();
                        System.out.println("Ingrese usuario: ");
                        usuarioG = leer.next();
                        System.out.println("Ingrese contraseña: ");
                        contraseñaG = leer.next();
                        System.out.println("Ingrese puesto de trabajo: ");
                        puesto = leer.next();
                        System.out.println("Ingrese años en el cargo: ");
                        añosCargo = leer.nextInt();
                        System.out.println("Ingrese salario base: ");
                        salarioBase = leer.nextDouble();
                        System.out.println("Ingrese el lenguaje de programacion que domina: ");
                        lenguajePrograDomina = leer.next();
                        System.out.println("Ingrese horario de trabajo: ");
                        horario = leer.next();

                        listaEntidades.add(new programadores(puesto, añosCargo, salarioBase, lenguajePrograDomina, horario, nombre, apellido, ID, usuarioG, contraseñaG));
                    }

                    if (opc1 == 3) {
                        System.out.println("Ingrese nombre: ");
                        nombre = leer.next();
                        System.out.println("Ingrese apellido: ");
                        apellido = leer.next();
                        System.out.println("Ingrese ID: ");
                        ID = leer.next();
                        System.out.println("Ingrese usuario: ");
                        usuarioG = leer.next();
                        System.out.println("Ingrese contraseña: ");
                        contraseñaG = leer.next();
                        System.out.println("Ingrese puesto de trabajo: ");
                        puesto = leer.next();
                        System.out.println("Ingrese años en el cargo: ");
                        añosCargo = leer.nextInt();
                        System.out.println("Ingrese salario base: ");
                        salarioBase = leer.nextDouble();
                        System.out.println("Ingrese medio de transporte: ");
                        medioTransporte = leer.next();
                        System.out.println("Ingrese cantidad maxima de encargos: ");
                        cantMaxEncargos = leer.nextInt();

                        listaEntidades.add(new motoristas(puesto, añosCargo, salarioBase, comisiones, medioTransporte, cantMaxEncargos, nombre, apellido, ID, usuarioG, contraseñaG));

                    }
                    if (opc1 == 4) {
                        System.out.println("Ingrese nombre: ");
                        nombre = leer.next();
                        System.out.println("Ingrese apellido: ");
                        apellido = leer.next();
                        System.out.println("Ingrese ID: ");
                        ID = leer.next();
                        System.out.println("Ingrese usuario: ");
                        usuarioG = leer.next();
                        System.out.println("Ingrese contraseña: ");
                        contraseñaG = leer.next();
                        System.out.println("Ingrese domicilio: ");
                        domicilio = leer.next();

                        listaEntidades.add(new clientes(domicilio, cantVecespedido, nombre, apellido, ID, usuarioG, contraseñaG));
                    }

                    if (opc1 == 5) {
                        System.out.println("Ingrese nombre: ");
                        nombreR = leer.next();
                        System.out.println("Ingrese ubicacion: ");
                        ubicacion = leer.next();
                        System.out.println("Ingrese RTN: ");
                        RTN = leer.next();
                        System.out.println("Ingrese slogan:");
                        slogan = leer.next();

                        listaRestaurantes.add(new restaurante(nombreR, ubicacion, RTN, slogan));
                    }

                    if (opc1 == 6) {
                        System.out.println("Ingrese nombre: ");
                        nombreC = leer.next();
                        System.out.println("Ingrese precio: ");
                        precio = leer.nextDouble();
                        System.out.println("Ingrese cantidad de acompañamientos: ");
                        cantAcompa = leer.nextInt();
                    }

                    if (opc1 == 7) {
                        System.out.println("Ingrese nombre");
                        nombreAcompañamiento = leer.next();
                        System.out.println("Tipo de acompañamiento");
                        System.out.println("1-Asado");
                        System.out.println("2-Frito");
                        System.out.println("3-Pan");
                        System.out.println("4-Salsa");
                        System.out.println("Elija su opcion: ");
                        tipo = leer.next();
                        if (tipo.equals("1")) {
                            tipo = "Asado";
                        }
                        if (tipo.equals("2")) {
                            tipo = "Frito";
                        }
                        if (tipo.equals("3")) {
                            tipo = "Pan";
                        }
                        if (tipo.equals("4")) {
                            tipo = "Salsa";
                        }
                        System.out.println("Ingrese el precio adicional: ");
                        precioAdicional = leer.nextDouble();

                        listaAcompañamientos.add(new acompañamiento(nombreAcompañamiento, tipo, precioAdicional));
                    }

                    if (opc1 == 8) {
                        System.out.println("Ingrese el nombre: ");
                        nombreT = leer.next();
                        System.out.println("Ingrese ubicacion: ");
                        ubicacion = leer.next();
                        System.out.println("Ingrese cantidad de empleados: ");
                        cantEmpleados = leer.nextInt();
                        System.out.println("Ingrese el tiempo de espera en minutos: ");
                        tiempoEsperaPreparacionMinutos = leer.nextDouble();

                        listaTiendas.add(new tienda(nombreT, ubicacion, cantEmpleados, tiempoEsperaPreparacionMinutos));
                    }

                    if (opc1 == 9) {
                        System.out.println("Ingrese nombre: ");
                        nombreA = leer.next();
                        System.out.println("Tipo de categoria");
                        System.out.println("1-limpieza");
                        System.out.println("2-ocio");
                        System.out.println("3-lectura");
                        System.out.println("4-otro");
                        System.out.println("Elija su opcion: ");
                        categoria = leer.next();
                        if (categoria.equals("1")) {
                            categoria = "limpieza";
                        }
                        if (categoria.equals("2")) {
                            categoria = "ocio";
                        }
                        if (categoria.equals("3")) {
                            categoria = "lectura";
                        }
                        if (categoria.equals("4")) {
                            categoria = "otro";
                        }
                        System.out.println("Ingrese el precio: ");
                        precioA = leer.nextDouble();

                        listaArticulos.add(new articulos(nombreA, categoria, precioA));
                    }
                    if (opc1 == 10) {
                        System.out.println("----ADMINISTRADORES----");
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof administradores) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    if (opc1 == 11) {
                        System.out.println("----PROGRAMADORES----");
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof programadores) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    if (opc1 == 12) {
                        System.out.println("----MOTORISTAS----");
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof motoristas) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }

                    if (opc1 == 13) {
                        System.out.println("----CLIENTES----");
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof clientes) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }

                    if (opc1 == 14) {
                        System.out.println("----RESTAURANTES----");
                        String salida = "";
                        for (Object t : listaRestaurantes) {
                            if (t instanceof restaurante) {
                                salida += listaRestaurantes.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    if (opc1 == 15) {
                        System.out.println("----COMIDAS----");
                        String salida = "";
                        for (Object t : listaComidas) {
                            if (t instanceof comida) {
                                salida += listaComidas.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }

                    if (opc1 == 16) {
                        System.out.println("----ACOMPAÑAMIENTOS----");
                        String salida = "";
                        for (Object t : listaAcompañamientos) {
                            if (t instanceof acompañamiento) {
                                salida += listaAcompañamientos.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }

                    if (opc1 == 17) {
                        System.out.println("----TIENDAS----");
                        String salida = "";
                        for (Object t : listaTiendas) {
                            if (t instanceof tienda) {
                                salida += listaTiendas.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }

                    if (opc1 == 18) {
                        System.out.println("----ARTICULOS----");
                        String salida = "";
                        for (Object t : listaArticulos) {
                            if (t instanceof articulos) {
                                salida += listaArticulos.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    if (opc1 == 19) {
                        System.out.println("ELIMINAR ENTIDAD");
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof entidades) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int entidadEliminar;
                        System.out.println("Ingrese el numero de la entidad a eliminar: ");
                        entidadEliminar = leer.nextInt();
                        listaEntidades.remove(entidadEliminar);

                    }

                    if (opc1 == 20) {
                        System.out.println("ELIMINAR RESTAURANTE");
                        String salida = "";
                        for (Object t : listaRestaurantes) {
                            if (t instanceof restaurante) {
                                salida += listaRestaurantes.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int restauranteEliminar;
                        System.out.println("Ingrese el numero del restaurante a eliminar: ");
                        restauranteEliminar = leer.nextInt();
                        listaEntidades.remove(restauranteEliminar);
                    }

                    if (opc1 == 21) {
                        System.out.println("ELIMINAR COMIDA");
                        String salida = "";
                        for (Object t : listaComidas) {
                            if (t instanceof comida) {
                                salida += listaComidas.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int comidaEliminar;
                        System.out.println("Ingrese el numero de la comida a eliminar: ");
                        comidaEliminar = leer.nextInt();
                        listaEntidades.remove(comidaEliminar);
                    }

                    if (opc1 == 22) {
                        System.out.println("ELIMINAR ACOMPAÑAMIENTO");
                        String salida = "";
                        for (Object t : listaAcompañamientos) {
                            if (t instanceof acompañamiento) {
                                salida += listaAcompañamientos.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int acompañamientoEliminar;
                        System.out.println("Ingrese el numero del acompañamiento a eliminar: ");
                        acompañamientoEliminar = leer.nextInt();
                        listaEntidades.remove(acompañamientoEliminar);
                    }
                    if (opc1 == 23) {
                        System.out.println("ELIMINAR TIENDA");
                        String salida = "";
                        for (Object t : listaTiendas) {
                            if (t instanceof tienda) {
                                salida += listaTiendas.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int tiendaEliminar;
                        System.out.println("Ingrese el numero de la tienda a eliminar: ");
                        tiendaEliminar = leer.nextInt();
                        listaEntidades.remove(tiendaEliminar);
                    }

                    if (opc1 == 24) {
                        System.out.println("ELIMINAR ARTICULO");
                        String salida = "";
                        for (Object t : listaArticulos) {
                            if (t instanceof articulos) {
                                salida += listaArticulos.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);

                        int articuloEliminar;
                        System.out.println("Ingrese el numero del articulo a eliminar: ");
                        articuloEliminar = leer.nextInt();
                        listaEntidades.remove(articuloEliminar);
                    }

                    if (opc1 == 25) {
                        //MOSTRANDO ENTIDADES
                        String salida = "";
                        for (Object t : listaEntidades) {
                            if (t instanceof entidades) {
                                salida += listaEntidades.indexOf(t) + "- " + t + "\n";
                            }
                        }
                        System.out.println(salida);
                        //FIN MOSTRAR ENTIDADES

                        int entidadModificar, valorModificar;
                        System.out.println("Ingrese el numero de la entidad a modificar: ");
                        entidadModificar = leer.nextInt();

                        System.out.println("¿Que valor desea modificar?");
                        System.out.println("1-Nombre\n"
                                + "2-Apellido\n"
                                + "3-ID\n"
                                + "4-Usuario\n"
                                + "5-Contraseña\n"
                                + "6-Puesto\n"
                                + "7-AñosEnCargo\n"
                                + "8-Salario Base\n"
                                + "9-Años de experiencia\n"
                                + "10-Lenguaje de programacion que mejor domina\n"
                                + "11-Horario\n"
                                + "12-Medio de transporte\n"
                                + "13-Horario\n");

                        valorModificar = leer.nextInt();
                        leer.next();
                        if (valorModificar == 1) {
                            String nombreN;
                            System.out.println("Ingrese el nuevo nombre: ");
                            nombreN = leer.next();
                            ((entidades) listaEntidades.get(entidadModificar)).setNombre(nombreN);
                        }

                        if (valorModificar == 2) {
                            String apellidoN;
                            System.out.println("Ingrese el nuevo apellido: ");
                            apellidoN = leer.next();
                            ((entidades) listaEntidades.get(entidadModificar)).setApellido(apellidoN);
                        }

                        if (valorModificar == 3) {
                            String IDN;
                            System.out.println("Ingrese el nuevo ID: ");
                            IDN = leer.next();
                            ((entidades) listaEntidades.get(entidadModificar)).setID(IDN);
                        }
                        if (valorModificar == 4) {
                            String usuarioN;
                            System.out.println("Ingrese el nuevo Usuario: ");
                            usuarioN = leer.next();
                            ((entidades) listaEntidades.get(entidadModificar)).setUsuario(usuarioN);
                        }
                        if (valorModificar == 5) {
                            String contraseñaN;
                            System.out.println("Ingrese la nueva contraseña: ");
                            contraseñaN = leer.next();
                            ((entidades) listaEntidades.get(entidadModificar)).setContraseña(contraseñaN);
                        }
                        if (valorModificar == 6) {
                            String puestoN;
                            System.out.println("Ingrese el nuevo puesto: ");
                            puestoN = leer.next();
                            ((administradores) listaEntidades.get(entidadModificar)).setPuesto(puestoN);
                        }
                        if (valorModificar == 7) {
                            String añoscargoN;
                            System.out.println("Ingrese los nuevos años en cargo: ");
                            añoscargoN = leer.next();
                            ((administradores) listaEntidades.get(entidadModificar)).setPuesto(añoscargoN);
                        }
                        if (valorModificar == 8) {
                            String salarioBaseN;
                            System.out.println("Ingrese el nuevo salario base: ");
                            salarioBaseN = leer.next();
                            ((administradores) listaEntidades.get(entidadModificar)).setPuesto(salarioBaseN);
                        }
                        if (valorModificar == 9) {
                            String añosExpN;
                            System.out.println("Ingrese los nuevos años de experiencia: ");
                            añosExpN = leer.next();
                            ((administradores) listaEntidades.get(entidadModificar)).setPuesto(añosExpN);
                        }
                        if (valorModificar == 10) {
                            String lenguajeDomN;
                            System.out.println("Ingrese el nuevo lenguaje que mejor domina: ");
                            lenguajeDomN = leer.next();
                            ((programadores) listaEntidades.get(entidadModificar)).setLenguajeProgaDomina(lenguajeDomN);
                        }
                        if (valorModificar == 11) {
                            String horarioN;
                            System.out.println("Ingrese el nuevo horario: ");
                            horarioN = leer.next();
                            ((programadores) listaEntidades.get(entidadModificar)).setHorario(horarioN);
                        }
                        if (valorModificar == 12) {
                            String medioTransN;
                            System.out.println("Ingrese el nuevo medio de transporte: ");
                            medioTransN = leer.next();
                            ((motoristas) listaEntidades.get(entidadModificar)).setMedioTransporte(medioTransN);
                        }
                        if (valorModificar == 13) {
                            int cantMaxN;
                            System.out.println("Ingrese la nueva cantidad maxima de encargos: ");
                            cantMaxN = leer.nextInt();
                            ((motoristas) listaEntidades.get(entidadModificar)).setCantMaxEncargos(cantMaxN);
                        }
                        if (valorModificar == 15) {
                            String domicilioN;
                            System.out.println("Ingrese el nuevo domicilio: ");
                            domicilioN = leer.next();
                            ((clientes) listaEntidades.get(entidadModificar)).setDomicilio(domicilioN);
                        }
                    }
                }
                //////
            }
        }
    }

}
