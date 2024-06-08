    package BaiTapCodeptit;

    import java.io.*;
    import java.util.*;

    class Product{
        private String idx, name, prime, guarantee;

        public Product(String idx, String name, String prime, String guarantee) {
            this.idx = idx;
            this.name = name;
            this.prime = prime;
            this.guarantee = guarantee;
        }

        public String getIdx() {
            return idx;
        }

        public int getPrime() {
            return Integer.parseInt(prime);
        }

        @Override
        public String toString() {
            return idx + " " + name + " " + prime + " " + guarantee;
        }
    }
    public class J07048 {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = sc.nextInt();
            sc.nextLine();
            List<Product> products = new ArrayList<>();
            for(int i = 1; i <= n; i++){
                products.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            products.stream().sorted(Comparator.comparing(Product::getPrime).reversed().thenComparing(Product::getIdx))
                    .forEach(System.out::println);
        }
    }
