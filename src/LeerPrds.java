
 import java.util.Scanner;
       
       public class LeerPrds {
       
           public static void main(String[] args) {
               Scanner read = new Scanner(System.in);
       
               System.out.println("Ingrese el número de productos en el inventario: ");
               int numProductos = read.nextInt();
       
               
               String[] inventario = new String[numProductos];
       
               
               for (int i = 0; i < numProductos; i++) {
                   System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
                   inventario[i] = read.next();
               }
       
               System.out.println("Ingrese el nombre del producto: ");
               String productoBuscado = read.next();
       
               boolean encontrado = false;
               for (String producto : inventario) {
                   if (producto.equalsIgnoreCase(productoBuscado)) {
                       encontrado = true;
                       break;
                   }
               }
       
               if (encontrado) {
                   System.out.print("El producto \"" + productoBuscado + "\" se encuentra disponible en el inventario.");
               } else {
                   System.out.print("El producto \"" + productoBuscado + "\" no está disponible en el inventario.");
               }
       
               read.close();
           }
       }




