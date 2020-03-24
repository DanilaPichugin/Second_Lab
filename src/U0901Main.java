public class U0901Main {
    public static void main(String args[]){
        Integer intArr[] = {10, 20, 15};
        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        System.out.println("Summa Integer : " + insWorkArrayInt.sum());

        Float floatArr[] = new Float[10];
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        for(int i=0; i<10; i++){
            floatArr[i] = (float) Math.random();
        }
        System.out.println("Summa Float : " + insWorkArrayFloat.sum());
        /*попытка передать в экземпляр типизированного класса массив String был заблокирован средой разработке(по
        понятной причине)
        String[] stringArr = {"a","b","c"};
        U0901WorkArray<String> insWorkArrayString = new U0901WorkArray<>(stringArr);
        */
    }
}
