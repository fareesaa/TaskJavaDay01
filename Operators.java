class Operators{

    public static void main(String[] args){
        
        int iPanjang = 12;
        int iLebar = 8;
        int iLuasPersegi;
        iLuasPersegi = iPanjang * iLebar ;
        System.out.println("Luas Persegi adalah " + iLuasPersegi);

        float fAlas = 7.0f;
        float fTinggi = 3.5f;
        float fLuasSegitiga = fAlas * fTinggi /2;
        System.out.println("Luas Segitiga adalah " + fLuasSegitiga);
        
        Boolean bCompare;
        bCompare = iLuasPersegi > fLuasSegitiga;
        System.out.println("Luas persegi lebih besar dari luas segitiga: " + bCompare + "\n");
        
        System.out.println("\n===Decrement===");
        System.out.println("3 kali Decrement");
        for(int i = 0 ; i<3 ; ++i){
            int a = iLuasPersegi - i;
            System.out.println(a);
        }
        System.out.println("\n===Increment===");
        System.out.println("6 kali Increment");
        for(int i = 0 ; i<6 ; ++i){
            int b = iLuasPersegi + i;
            System.out.println(b);
        }

    }
}