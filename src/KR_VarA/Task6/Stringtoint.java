package KR_VarA.Task6;

public class Stringtoint {
    public static void main(String[] args) {
        String num = "1234";
        int a = Integer.parseInt(num); //возращает примитив

        Integer b = Integer.valueOf(num); //возращает кешированный экземпляр

        Integer c = new Integer(num); //через констурктор

        System.out.println(str(num)); //вручную.
    }

    public static int str(String num){
        int i = 0; //тут будут наши единицы, десятки и тд
        int lol = 0; //итоговое число которое мы слепим

        while(i<num.length()){
            lol *= 10; //будем каждый проход увеличивать десятки. типа сначала рассматриваем единицы, потом десятки, потос сотки
            lol +=num.charAt(i++) - '0'; //добавляем элемент с индексом i, начинаем с 0 если что
        }
        return lol; //возравращаем
    }
}
