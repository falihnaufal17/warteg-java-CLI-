/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_makanan;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Menu_makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int pil1 = 1000, pil2 = 5000, pil3 = 1500, pil4 = 1500, pil5 = 3000, pil6 = 6500;
        int totalnambah = 0;
        System.out.println("+----+------------------+--------------+");
        System.out.println("| No | Menu Makanan     | Harga        |");
        System.out.println("+----+------------------+--------------+");
        System.out.println("| 1  | Nasi             | Rp. 1000     |");
        System.out.println("| 2  | Ayam goreng      | Rp. 5000     |");
        System.out.println("| 3  | Tahu             | Rp. 1500     |");
        System.out.println("| 4  | Tempe            | Rp. 1500     |");
        System.out.println("| 5  | Telor bebek asin | Rp. 3000     |");
        System.out.println("| 6  | Mie Baso         | Rp. 6500     |");
        System.out.println("+----+------------------+--------------+");
        System.out.println();
        
        //milih
        int milih = 0, porsi1 = 0,porsi2 = 0,porsi3 = 0,porsi4 = 0,porsi5 = 0,porsi6 = 0 , totalporsi = 0, totalharga = 0, bayar = 0, kembalian = 0, angka = 0;
        int harga1 = 0, harga2 = 0, harga3 = 0, harga4 = 0, harga5 = 0, harga6 = 0;
        int tanya;
        //System.out.println("Pilih menu makanan: ");
        //milih = in.nextInt();
        //tanya
            System.out.println("Dibungkus atau makan di sini? [1/2]");
            System.out.println("1 = Dibungkus");
            System.out.println("2 = Makan disini");
            System.out.print("Pilihan Anda: ");
            tanya = in.nextInt();
            if(tanya == 1){
            System.out.print("Masukan Banyaknya menu yang di pilih ");
            angka= in.nextInt();
            for(int i=1; i<=angka; i++){
                System.out.print("Pilih kode pesanan " + i + " : ");
                milih = in.nextInt();
                    if(milih == 1){
                        System.out.println("Nasi, harga: " + pil1);
                        System.out.print("Porsi: ");
                        porsi1 = in.nextInt();
                        
                        harga1 = pil1 * porsi1;
                        System.out.println("Harga = " + harga1 + "\n");
                    }else if(milih == 2){
                        System.out.println("Ayam goreng, harga: " + pil2);
                        System.out.print("Porsi: ");
                        porsi2 = in.nextInt();
                        
                        harga2 = pil2 * porsi2;
                        System.out.println("Harga = " + harga2 + "\n");
                    }else if(milih == 3){
                        System.out.println("Tahu, harga: " + pil3);
                        System.out.print("Porsi: ");
                        porsi3 = in.nextInt();
                        
                        harga3 = pil3 * porsi3;
                        System.out.println("Harga = " + harga3 + "\n");
                    }else if(milih == 4){
                        System.out.println("Tempe, harga: " + pil4);
                        System.out.print("Porsi: ");
                        porsi4 = in.nextInt();
                        
                        harga4 = pil4 * porsi4;
                        System.out.println("Harga = " + harga4 + "\n");
                    }else if(milih == 5){
                        System.out.println("Telor bebek asin, harga: " + pil5);
                        System.out.print("Porsi: ");
                        porsi5 = in.nextInt();
                        
                        harga5 = pil5 * porsi5;
                        System.out.println("Harga = " + harga5 + "\n");
                    }else if(milih == 6){
                        System.out.println("Mie baso, harga: " + pil6);
                        System.out.print("Porsi: ");
                        porsi6 = in.nextInt();
                        
                        harga6 = pil6 * porsi6;
                        System.out.println("Harga = " + harga6 + "\n");
                    }else{
                        System.out.println("Pilihan tidak tersedia!");
                    }
                totalporsi = porsi1 + porsi2 + porsi3 + porsi4 + porsi5 + porsi6;
                totalharga = harga1 + harga2 + harga3 + harga4 + harga5 + harga6;
            }
            System.out.println("Total porsi = " + totalporsi);
            System.out.println("Total harga = " + totalharga + "\n");
            System.out.print("Bayar = ");
                    bayar = in.nextInt();
                    System.out.println();
                    
                    kembalian = bayar - totalharga;
                    System.out.println("Kembalian = " + kembalian);
                    System.out.println("Terimaksih telah datang!");

            }else if(tanya == 2){
                System.out.print("Masukan Banyaknya menu yang di pilih ");
            angka= in.nextInt();
            for(int i=1; i<=angka; i++){
                System.out.print("Pilih kode pesanan " + i + " : ");
                milih = in.nextInt();
                    if(milih == 1){
                        System.out.println("Nasi, harga: " + pil1);
                        System.out.print("Porsi: ");
                        porsi1 = in.nextInt();
                        
                        harga1 = pil1 * porsi1;
                        System.out.println("Harga = " + harga1 + "\n");
                    }else if(milih == 2){
                        System.out.println("Ayam goreng, harga: " + pil2);
                        System.out.print("Porsi: ");
                        porsi2 = in.nextInt();
                        
                        harga2 = pil2 * porsi2;
                        System.out.println("Harga = " + harga2 + "\n");
                    }else if(milih == 3){
                        System.out.println("Tahu, harga: " + pil3);
                        System.out.print("Porsi: ");
                        porsi3 = in.nextInt();
                        
                        harga3 = pil3 * porsi3;
                        System.out.println("Harga = " + harga3 + "\n");
                    }else if(milih == 4){
                        System.out.println("Tempe, harga: " + pil4);
                        System.out.print("Porsi: ");
                        porsi4 = in.nextInt();
                        
                        harga4 = pil4 * porsi4;
                        System.out.println("Harga = " + harga4 + "\n");
                    }else if(milih == 5){
                        System.out.println("Telor bebek asin, harga: " + pil5);
                        System.out.print("Porsi: ");
                        porsi5 = in.nextInt();
                        
                        harga5 = pil5 * porsi5;
                        System.out.println("Harga = " + harga5 + "\n");
                    }else if(milih == 6){
                        System.out.println("Mie baso, harga: " + pil6);
                        System.out.print("Porsi: ");
                        porsi6 = in.nextInt();
                        
                        harga6 = pil6 * porsi6;
                        System.out.println("Harga = " + harga6 + "\n");
                    }else{
                        System.out.println("Pilihan tidak tersedia!");
                    }
                totalporsi = porsi1 + porsi2 + porsi3 + porsi4 + porsi5 + porsi6;
                totalharga = harga1 + harga2 + harga3 + harga4 + harga5 + harga6;
            }
                    System.out.println("Apakah ingin menambah lagi atau tidak? [1/2]");
                    System.out.println("1 = Nambah");
                    System.out.println("2 = Tidak");
                    System.out.print("Pilihan Anda: ");
                    int a = in.nextInt();
                        if(a == 1){
                            int totalharga2 = 0;
                            System.out.print("Ingin nambah berapa? ");
                            angka = in.nextInt();
                            for(int i=1; i<=angka; i++){
                             System.out.print("Pilih menu makanan " + "["+i+"]" + ": ");
                              milih = in.nextInt();
                                if(milih == 1){
                                    System.out.println("Nasi, harga: " + pil1);
                                    System.out.print("Porsi: ");
                                    porsi1 = in.nextInt();

                                    harga1 = pil1 * porsi1;
                                    System.out.println("Harga = " + harga1 + "\n");
                                }else if(milih == 2){
                                    System.out.println("Ayam goreng, harga: " + pil2);
                                    System.out.print("Porsi: ");
                                    porsi2 = in.nextInt();

                                    harga2 = pil2 * porsi2;
                                    System.out.println("Harga = " + harga2 + "\n");
                                }else if(milih == 3){
                                    System.out.println("Tahu, harga: " + pil3);
                                    System.out.print("Porsi: ");
                                    porsi3 = in.nextInt();

                                    harga3 = pil3 * porsi3;
                                    System.out.println("Harga = " + harga3 + "\n");
                                }else if(milih == 4){
                                    System.out.println("Tempe, harga: " + pil4);
                                    System.out.print("Porsi: ");
                                    porsi4 = in.nextInt();

                                    harga4 = pil4 * porsi4;
                                    System.out.println("Harga = " + harga4 + "\n");
                                }else if(milih == 5){
                                    System.out.println("Telor bebek asin, harga: " + pil5);
                                    System.out.print("Porsi: ");
                                    porsi5 = in.nextInt();

                                    harga5 = pil5 * porsi5;
                                    System.out.println("Harga = " + harga5 + "\n");
                                }else if(milih == 6){
                                    System.out.println("Mie baso, harga: " + pil6);
                                    System.out.print("Porsi: ");
                                    porsi6 = in.nextInt();

                                    harga6 = pil6 * porsi6;
                                    System.out.println("Harga = " + harga6 + "\n");
                                }else{
                                    System.out.println("Pilihan tidak tersedia!");
                                }
                                
                                totalharga2 = totalharga2 + harga1 + harga2 + harga3 + harga4 + harga5 + harga6;
                            }
                            
                            totalnambah = totalharga + totalharga2;
                            System.out.println("Total Harga Nambah = " + totalnambah );
                            System.out.print("Bayar = ");
                            bayar = in.nextInt();
                            System.out.println();
                    
                            kembalian = bayar - totalnambah;
                            System.out.println("Kembalian = " + kembalian);
                            System.out.println("Terimaksih telah datang!");
                        }
                        else{
                            System.out.print("Bayar = ");
                            bayar = in.nextInt();
                            System.out.println();
                    
                            kembalian = bayar - totalharga;
                            System.out.println("Kembalian = " + kembalian);
                            System.out.println("Terimaksih telah datang!");
                        }
                }else{
                    System.out.println("Masukan salah!, silahkan masukan dengan benar!");
                }
        //bukti pembelian
        System.out.println("                            +-------------------------------+");
        System.out.println("                            |        Bukti pembelian        |");
        System.out.println("                            +-------------------------------+");
        System.out.println("        +----+------------------+--------------------+-------+--------------+");
        System.out.println("        | No | Menu Makanan     | Porsi | Jumlah harga |");
        System.out.println("        +----+------------------+--------------------+-------+--------------+");
        System.out.println("        | 1  | Nasi             | " + porsi1 + "   | " + harga1 + " |");
        System.out.println("        | 2  | Ayam goreng      | " + porsi2 + "   | " + harga2 + " |");
        System.out.println("        | 3  | Tahu             | " + porsi3 + "   | " + harga3 + " |");
        System.out.println("        | 4  | Tempe            | " + porsi4 + "   | " + harga4 + " |");
        System.out.println("        | 5  | Telor bebek asin | " + porsi5 + "   | " + harga5 + " |");
        System.out.println("        | 6  | Mie Baso         | " + porsi6 + "   | " + harga6 + " |");
        System.out.println("        +----+------------------+--------------------+-------+--------------+");
        System.out.println("        | Total porsi: " + totalporsi + "                                    ");
        System.out.println("        | Total harga: " + totalharga + "                                    ");
        System.out.println("        | Total nambah: " + totalnambah + "                                  ");
        System.out.println("        | Bayar: " + bayar + "                                               ");
        System.out.println("        | Kembalian: " + kembalian + "                                       ");
        System.out.println("        +----------------------------------------------------+--------------+");
        }
    
    }