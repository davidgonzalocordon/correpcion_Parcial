/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package co.edu.udes.correpcion_parcial_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class Correpcion_parcial_2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Empleado> listEmploy = new ArrayList<>();
        List<String> listNameDisposicion = new ArrayList<>();
        List<Secretario> listSecretatio = new ArrayList<>();
        List<Vendedor> listVendedor = new ArrayList<>();
        List<JefeDeZona> listJefesDeZona = new ArrayList<>();
        Empleado Admin = new Empleado("David", "Cordon", "1235513", "Cucuta", "3212732892", 150000);
        listEmploy.add(Admin);
        boolean Repito = false;
        String nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, seleccion, area, numFax = "";
        double salaryEmpleado, comicion;
        int num_clientes = 0;

        System.out.println("Inserte el numero de empleados que desea crear: ");
        int num_empleados = read.nextInt();

        for (int j = 0; j < num_empleados; j++) {
            // Pedir datos del empleado al usuario
            System.out.print("Ingrese el nombre del empleado: ");
            nameEmploy = read.next();

            System.out.print("Ingrese los apellidos del empleado: ");
            apellidosEmpleado = read.next();

            System.out.print("Ingrese el DNI del empleado: ");
            DNIEmpleado = read.next();

            System.out.print("Ingrese la dirección del empleado: ");
            direccionEmpleado = read.next();

            System.out.print("Ingrese el numero de telefono del empleado: ");
            celEmpleado = read.next();

            System.out.print("Ingrese el salario del empleado: ");
            double salario = read.nextDouble();

            // Crear el objeto Empleado con los datos ingresados
            Empleado empleado = new Empleado(nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, salario);
            listEmploy.add(empleado);

            // Preguntar si desea asignar un supervisor
            System.out.print("Desea asignar un supervisor al empleado? (si/no): ");
            read.nextLine(); // Limpiar el buffer
            String respuesta = read.next();

            if (respuesta.equalsIgnoreCase("si")) {
                // Mostrar lista de empleados disponibles
                System.out.println("Lista de empleados disponibles:");
                for (int i = 0; i < listEmploy.size(); i++) {
                    System.out.println((i + 1) + ". " + listEmploy.get(i).getName() + " " + listEmploy.get(i).getApellidos());
                }

                // Pedir que seleccione un empleado
                System.out.print("Seleccione un empleado por su número: ");
                int indiceEmpleado = read.nextInt();
                read.nextLine(); // Consumir salto de línea

                // Asignar supervisor
                Empleado supervisor = listEmploy.get(indiceEmpleado - 1);
                empleado.setSupervisor(supervisor);
            }

            System.out.println("Desea aumentarle el salario? si/no");
            respuesta = read.next();
            if (respuesta.equals("si")) {
                System.out.println("Inserte el porcentaje que le va a aumentar: ");
                int porcentaje = read.nextInt() / 100;
                empleado.aumentarSalario(porcentaje);
            }

            // Imprimir la lista de empleados
            System.out.println("Lista de empleados:");
            for (Empleado n : listEmploy) {
                System.out.println(n.toString());
            }
        }
        // Pedir cantidad de secretarios
        System.out.print("Ingrese la cantidad de secretarios a crear: ");
        int numSecretarios = read.nextInt();
        // Pedir datos de cada secretario y agregarlo al arreglo
        for (int i = 0; i < numSecretarios; i++) {
            System.out.println("Ingrese los datos del secretario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nameEmploy = read.next();
            System.out.print("Apellidos: ");
            apellidosEmpleado = read.next();
            System.out.print("DNI: ");
            DNIEmpleado = read.next();
            System.out.print("Direccion: ");
            direccionEmpleado = read.next();
            System.out.print("Telefono: ");
            celEmpleado = read.next();
            System.out.print("Salario: ");
            double salario = read.nextDouble();
            System.out.print("Despacho: ");
            String despacho = read.next();
            System.out.print("Num_fax: ");
            String num_fax = read.next();

            Secretario secretario = new Secretario(despacho, num_fax, nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, salario);
            listSecretatio.add(secretario);
            System.out.println("Desea aumentarle el salario? si/no");
            String respuesta = read.next();
            if (respuesta.equals("si")) {
                secretario.aumentarSalario();
                System.out.println("el salario se a actualizado y ahora es de " + secretario.getSalario());
            }
        }
        // Imprimir la lista de empleados
        System.out.println("Lista de empleados:");
        for (Secretario s : listSecretatio) {
            // Imprimir datos personales
            System.out.println("Datos personales del secretario:");
            System.out.println("Nombre completo: " + s.getName() + " " + s.getApellidos());
            System.out.println("DNI: " + s.getDNI());
            System.out.println("Dirección: " + s.getDireccion());
            System.out.println("Teléfono: " + s.getTelefono());

            // Imprimir toString
            System.out.println("toString del secretario:");
            System.out.println(s.toString());
        }

        System.out.println("inserte el numero de vendedores que desea crear: ");
        int num_vendedores = read.nextInt();
        for (int i = 0; i < num_vendedores; i++) {
            ArrayList<Clintes> listClientes = new ArrayList<>();
            System.out.println("Ingrese los datos del vendedor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nameEmploy = read.next();
            System.out.print("Apellidos: ");
            apellidosEmpleado = read.next();
            System.out.print("DNI: ");
            DNIEmpleado = read.next();
            System.out.print("Direccion: ");
            direccionEmpleado = read.next();
            System.out.print("Telefono: ");
            celEmpleado = read.next();
            System.out.print("Salario: ");
            double salario = read.nextDouble();
            System.out.println("inserte la ID de la matricula del coche: ");
            String id_matricula = read.next();
            System.out.println("inserte la marca del coche: ");
            String marca = read.next();
            System.out.println("Inserte el modelo del coche: ");
            String modelo = read.next();
            Coche newCoche = new Coche(id_matricula, marca, modelo);
            System.out.println("Inserte el area de venta del vendedor: ");
            String area_venta = read.next();
            System.out.println("Inserte el numero de clientes que desea insertar:");
            num_clientes = read.nextInt();
            for (int j = 0; j < num_clientes; j++) {
                System.out.println("Ingrese los datos del cliente " + (j + 1) + ":");
                System.out.println("Inserte el nombre completo del cliente: ");
                String name_Cliente = read.next();
                System.out.println("Inserte DNI del Cliente: ");
                String DNIcliente = read.next();
                Clintes newCliente = new Clintes(name_Cliente, DNIcliente);
                listClientes.add(newCliente);
            }
            System.out.println("Inserte el porcenta de comicion del vendedor: ");
            float Comicion = read.nextInt() / 100;
            Vendedor newVendedor = new Vendedor(newCoche, area_venta, listClientes, Comicion, nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, salario);
            listVendedor.add(newVendedor);

            // Preguntar al usuario si desea agregar o eliminar clientes existentes
            System.out.println("¿Desea agregar un nuevo cliente (A), eliminar un cliente existente (E) o ninguno (N)?");
            String option = read.next().toUpperCase();

            while (!option.equals("A") && !option.equals("E") && !option.equals("N")) {
                System.out.println("Opción no válida. Ingrese A para agregar un cliente, E para eliminar un cliente o N para continuar sin cambios.");
                option = read.next().toUpperCase();
            }
            while (option.equals("A") || option.equals("E")) {
                if (option.equals("A")) {
                    for (int j = 0; j < num_clientes; j++) {
                        System.out.println("Ingrese los datos del cliente " + (j + 1) + ":");
                        System.out.println("Inserte el nombre completo del cliente: ");
                        String name_Cliente = read.next();
                        System.out.println("Inserte DNI del Cliente: ");
                        String DNIcliente = read.next();
                        Clintes newCliente = new Clintes(name_Cliente, DNIcliente);
                        newVendedor.agregarCliente(newCliente);

                    }
                } else if (option.equals("E")) {
                    System.out.println("Lista de clientes:");
                    for (Clintes listCliente : listClientes) {
                        System.out.println("DNI: " + listClientes.get(i).getDni() + ". " + listClientes.get(i).getNombre());
                    }
                    System.out.println("Ingrese el DNI del cliente que desea eliminar:");
                    String num_cliente = read.next();
                    newVendedor.eliminarCliente(num_cliente);

                }
                // Preguntar al usuario si desea agregar o eliminar clientes existentes
                System.out.println("¿Desea agregar un nuevo cliente (A), eliminar un cliente existente (E) o ninguno (N)?");
                option = read.next().toUpperCase();

                while (!option.equals("A") && !option.equals("E") && !option.equals("N")) {
                    System.out.println("Opción no válida. Ingrese A para agregar un cliente, E para eliminar un cliente o N para continuar sin cambios.");
                    option = read.next().toUpperCase();
                }
            }
            System.out.println("Desea cambiar el choche del vendedor? S/N");
            option = read.next();
            if (option.equals("S")) {
                System.out.println("inserte la ID de la matricula del coche: ");
                id_matricula = read.next();
                System.out.println("inserte la marca del coche: ");
                marca = read.next();
                System.out.println("Inserte el modelo del coche: ");
                modelo = read.next();
                newVendedor.CAmbiarCoche(id_matricula, marca, modelo);
            }
        }
        
        
        
        
        
        
        

        System.out.println("inserte el numero de jefes de zona que desea crear: ");
        int num_jefes_de_area = read.nextInt();
        for (int i = 0; i < num_jefes_de_area; i++) {
            ArrayList<Vendedor> listvendedoresAcargo = new ArrayList<>();
            System.out.println("Ingrese los datos del jefe de zona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String namejefe = read.next();
            System.out.print("Apellidos: ");
            String ApellidosJefe = read.next();
            System.out.print("DNI: ");
            String DNIjefe = read.next();
            System.out.print("Direccion: ");
            String direccionJefe = read.next();
            System.out.print("Telefono: ");
            String celJefe = read.next();
            System.out.print("Despacho: ");
            String despacho_jefe = read.next();
            System.out.print("Salario: ");
            double salarioJefe = read.nextDouble();
            System.out.println("inserte la ID de la matricula del coche: ");
            String id_matricula_jefe = read.next();
            System.out.println("inserte la marca del coche: ");
            String marca_jefe = read.next();
            System.out.println("Inserte el modelo del coche: ");
            String modelo_jefe = read.next();
            Coche newCoche_jefe = new Coche(id_matricula_jefe, marca_jefe, modelo_jefe);
            System.out.println("Inserte el numero de vendedores que estan bajo  su cargo:");
            num_vendedores = read.nextInt();
            for (int j = 0; j < num_vendedores; j++) {
                System.out.println("Ingrese los datos del vendedor " + (j + 1) + ":");
                ArrayList<Clintes> listClientes = new ArrayList<>();
                System.out.println("Ingrese los datos del vendedor " + (i + 1) + ":");
                System.out.print("Nombre: ");
                nameEmploy = read.next();
                System.out.print("Apellidos: ");
                apellidosEmpleado = read.next();
                System.out.print("DNI: ");
                DNIEmpleado = read.next();
                System.out.print("Direccion: ");
                direccionEmpleado = read.next();
                System.out.print("Telefono: ");
                celEmpleado = read.next();
                System.out.print("Salario: ");
                double salario = read.nextDouble();
                System.out.println("inserte la ID de la matricula del coche: ");
                String id_matricula = read.next();
                System.out.println("inserte la marca del coche: ");
                String marca = read.next();
                System.out.println("Inserte el modelo del coche: ");
                String modelo = read.next();
                Coche newCoche = new Coche(id_matricula, marca, modelo);
                System.out.println("Inserte el area de venta del vendedor: ");
                String area_venta = read.next();
                System.out.println("Inserte el numero de clientes que desea insertar:");
                num_clientes = read.nextInt();
                for (int h = 0; h < num_clientes; h++) {
                    System.out.println("Ingrese los datos del cliente " + (j + 1) + ":");
                    System.out.println("Inserte el nombre completo del cliente: ");
                    String name_Cliente = read.next();
                    System.out.println("Inserte DNI del Cliente: ");
                    String DNIcliente = read.next();
                    Clintes newCliente = new Clintes(name_Cliente, DNIcliente);
                    listClientes.add(newCliente);
                }
                System.out.println("Inserte el porcenta de comicion del vendedor: ");
                float Comicion = read.nextInt() / 100;
                Vendedor newVendedor = new Vendedor(newCoche, area_venta, listClientes, Comicion, nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, salario);
                listVendedor.add(newVendedor);
                listvendedoresAcargo.add(newVendedor);
            }

            for (Secretario s : listSecretatio) {
                System.out.println("Nombre: " + s.getName() + " - DNI: " + s.getDNI());
            }
            System.out.print("Ingrese el DNI del secretario que desea asignar a este jefe de zona: ");
            String dniSecretario = read.next();
            Secretario secretarioAsignado = null;
            for (Secretario s : listSecretatio) {
                if (s.getDNI().equals(dniSecretario)) {
                    secretarioAsignado = s;
                    break;
                }
            }
            if (secretarioAsignado == null) {
                System.out.println("No se encontró un secretario con el DNI ingresado.");
                continue;
            }

            JefeDeZona newjefe = new JefeDeZona(despacho_jefe, secretarioAsignado, listvendedoresAcargo, newCoche_jefe, namejefe, ApellidosJefe, DNIjefe, direccionJefe, celJefe, salarioJefe);
            listJefesDeZona.add(newjefe);

            // Preguntar al usuario si desea agregar o eliminar clientes existentes
            System.out.println("¿Desea agregar un nuevo vendedor (A), eliminar un vendedor existente (E) o ninguno (N)?");
            String option = read.next().toUpperCase();

            while (!option.equals("A") && !option.equals("E") && !option.equals("N")) {
                System.out.println("Opción no válida. Ingrese A para agregar un cliente, E para eliminar un cliente o N para continuar sin cambios.");
                option = read.next().toUpperCase();
            }
            while (option.equals("A") || option.equals("E")) {
                if (option.equals("A")) {
                    for (int j = 0; j < num_clientes; j++) {
                        System.out.println("Ingrese los datos del vendedor " + (j + 1) + ":");
                        ArrayList<Clintes> listClientes = new ArrayList<>();
                        System.out.println("Ingrese los datos del vendedor " + (i + 1) + ":");
                        System.out.print("Nombre: ");
                        nameEmploy = read.next();
                        System.out.print("Apellidos: ");
                        apellidosEmpleado = read.next();
                        System.out.print("DNI: ");
                        DNIEmpleado = read.next();
                        System.out.print("Direccion: ");
                        direccionEmpleado = read.next();
                        System.out.print("Telefono: ");
                        celEmpleado = read.next();
                        System.out.print("Salario: ");
                        double salario = read.nextDouble();
                        System.out.println("inserte la ID de la matricula del coche: ");
                        String id_matricula = read.next();
                        System.out.println("inserte la marca del coche: ");
                        String marca = read.next();
                        System.out.println("Inserte el modelo del coche: ");
                        String modelo = read.next();
                        Coche newCoche = new Coche(id_matricula, marca, modelo);
                        System.out.println("Inserte el area de venta del vendedor: ");
                        String area_venta = read.next();
                        System.out.println("Inserte el numero de clientes que desea insertar:");
                        num_clientes = read.nextInt();
                        for (int h = 0; h < num_clientes; h++) {
                            System.out.println("Ingrese los datos del cliente " + (j + 1) + ":");
                            System.out.println("Inserte el nombre completo del cliente: ");
                            String name_Cliente = read.next();
                            System.out.println("Inserte DNI del Cliente: ");
                            String DNIcliente = read.next();
                            Clintes newCliente = new Clintes(name_Cliente, DNIcliente);
                            listClientes.add(newCliente);
                        }
                        System.out.println("Inserte el porcenta de comicion del vendedor: ");
                        float Comicion = read.nextInt() / 100;
                        Vendedor newVendedor = new Vendedor(newCoche, area_venta, listClientes, Comicion, nameEmploy, apellidosEmpleado, DNIEmpleado, direccionEmpleado, celEmpleado, salario);
                        listVendedor.add(newVendedor);
                        listvendedoresAcargo.add(newVendedor);
                        newjefe.agregarVendedor(newVendedor);

                    }
                } else if (option.equals("E")) {
                    System.out.println("Lista de clientes:");
                    for (Vendedor listvendedoresacargo : listvendedoresAcargo) {
                        System.out.println("DNI: " + listvendedoresAcargo.get(i).getDNI()+ ". " + listvendedoresAcargo.get(i).getName());
                    }
                    System.out.println("Ingrese el DNI del cliente que desea eliminar:");
                    String dni_Vendedor = read.next();
                    newjefe.eliminarVendedor(dni_Vendedor);

                }
                // Preguntar al usuario si desea agregar o eliminar clientes existentes
                System.out.println("¿Desea agregar un nuevo cliente (A), eliminar un cliente existente (E) o ninguno (N)?");
                option = read.next().toUpperCase();

                while (!option.equals("A") && !option.equals("E") && !option.equals("N")) {
                    System.out.println("Opción no válida. Ingrese A para agregar un cliente, E para eliminar un cliente o N para continuar sin cambios.");
                    option = read.next().toUpperCase();
                }
            }

        }

    }
}
