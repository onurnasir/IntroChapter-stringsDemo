public class Main {

    public static void main(String[] args) {
        String mesaj = "  Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı:"+mesaj.length());
        System.out.println("5.eleman:"+mesaj.charAt(4)); // Bu fonksiyon mesaj değişkinindeki 5.elemanı buluyoruz.

        System.out.println(mesaj.concat(" Yaşasın!")); //Bu foksiyon mesaj değişkenine başka bir string ifade eklemek için concat yapısı kullanılır.

        System.out.println(mesaj.startsWith("u")); // Eğer değişken B ile başlıyorsa ve doğru ise Boolean döndürür.

        System.out.println(mesaj.endsWith(".")); // Eğer değişken B ile bitiyorsa ve doğru ise Boolean döndürür.

        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0); //String mesaj değişkeninde karakter alma yada çağırma yapısı
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); //String mesaj değişkeninde a karakterinin kaçıncı index olduğunu buldurur.
        System.out.println(mesaj.indexOf("ok")); //String mesaj değişkeninde ok kelimesini kaçıncı index olduğunu buldurur.
        System.out.println(mesaj.lastIndexOf("e")); // Buda cümlenin en solundan başlayarak sayıyor.*/

        //System.out.println(mesaj.replace(' ','-')); //replace foksiyonu string mesaj değişkenindeki karakterleri değiştirmek için kullanılır.
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj); // Yukardaki işlemde bununla farklı şekilde yapılabilir.

        System.out.println(mesaj.substring(2)); // Bu fonk. mesaj değişkenin içerisindeki metin ifadesinin ilk 2 karakterini atlayarak alır.
        System.out.println(mesaj.substring(2, 5)); // İlk baştan 2 ile 5 arasındaki indexleri alır.

        for (String kelime : mesaj.split("a")) { // Cümledeki verdiğimiz boşluk şartına göre kelimelere ayırdı.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //String mesaj değişkenindeki tüm büyük harfleri küçültmektedir.
        System.out.println(mesaj.toUpperCase()); //String mesaj değişkenindeki tüm küçük harfleri büyültmektedir.

        System.out.println(mesaj.trim()); // Cümlenin başındaki ve sonundaki boşlukları alır.
    }
}
