package Lab3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        boolean menu = true;
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        try (Scanner rd = new Scanner(new File(path))) {
            while (rd.hasNextLine()) {
                Scanner lr = new Scanner(rd.nextLine());
                lr.useDelimiter(",");
                int id = lr.nextInt();
                String name = lr.next();
                int available =lr.nextInt();
                int sold = lr.nextInt();
                String sstatus = lr.nextLine();
                boolean status = false;
                if (sstatus.equals("true")) {
                    status = true;
                }
                float price = lr.nextFloat();
                String category = lr.next();
                if (category.equals("Bebida")) {
                    float ml = lr.nextFloat();
                    String btype = lr.next();
                    Beverage bv = new Beverage(id, name, available, sold, status, price, ml, btype);
                    products.add(bv);
                } else if (category.equals("Snack")) {
                    float gr = lr.nextFloat();
                    String flavor = lr.next();
                    String size = lr.next();
                    Snack snck = new Snack(id, name, available, sold, status, price, gr, flavor, size);
                    products.add(snck);
                } else {
                    List<String> fields = new ArrayList<>();
                    while (lr.hasNext()) {
                        fields.add(lr.next());
                    }
                    Other other = new Other(id, name, available, sold, status, price, category, fields);
                    products.add(other);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo, revise bien el nombre");
            menu = false;
        }
        while (menu) {
            int op = s.nextInt();
            switch (op) {
                default:
                break;
                case 1:
                int id = s.nextInt();
                for (Product p : products) {
                    if (p.getId() == id) {
                        System.out.println("Nombre: " + p.getName());
                    }
                }
                break;
                case 2:
                s.nextLine();
                String category = s.nextLine();
                for (Product p : products) {
                    if (p.getClass() == Beverage.class && category.equals("Bebida")){
                        System.out.println(p.getName());
                    } else if (p.getClass() == Snack.class && category.equals("Snack")){
                        System.out.println(p.getName());
                    } else if (p.getClass()== Other.class) {
                        Other po = (Other) p;
                        if (po.getCategory().equals(category)) {
                            System.out.println(po.getName());
                        }
                    }
                }
                break;
                case 3:
                float total = 0;
                int n = 0;
                float comission = 0;
                List<String> categories = new ArrayList<>();
                List<Float> comissions = new ArrayList<>();
                for (Product p : products) {
                    total += p.getPrice() * p.getSold();
                    n ++;
                    if (p.getClass() == Other.class) {
                        comission += p.getPrice()*p.getSold() *0.20;
                        Other opp = (Other) p;
                        if (categories.indexOf(opp.getCategory()) == -1) {
                            categories.add(opp.getCategory());
                            comissions.add((float) 0);
                        }
                        comissions.set(categories.indexOf(opp.getCategory()), comissions.get(categories.indexOf(opp.getCategory())) + (float)(p.getPrice()*p.getSold() *0.20));
                    }
                }
                System.out.println("Total de ventas: " + n + "\nTotal recaudado: Q" + total + "\nComision de ventas: Q" + comission);
                System.out.println("Comisiones por categoría adicional:");
                for (String cat : categories) {
                    System.out.println(cat + ": Q" + comissions.get(categories.indexOf(cat)));
                }

                break;
                case 4:
                List<String> cats = new ArrayList<>();
                List<Integer> ncats = new ArrayList<>();
                int nbev = 0; int nsnack= 0;
                for (Product p: products) {
                    if (p.getClass() == Beverage.class) {
                        nbev++;
                    } else if (p.getClass() == Snack.class) {
                        nsnack++;
                    } else if (p.getClass() == Other.class) {
                        Other ot = (Other) p;
                        if (cats.indexOf(ot.getCategory()) == -1) {
                            cats.add(ot.getCategory());
                            ncats.add(0);
                        }
                        ncats.set(cats.indexOf(ot.getCategory()), ncats.get(cats.indexOf(ot.getCategory())) + 1);
                    }
                }
                break;
                case 5:
                menu = false;
                break;
            }
        }
        s.close();
    }    
}
