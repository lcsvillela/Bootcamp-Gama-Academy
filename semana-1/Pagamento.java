class Pagamento{

    public static void main(String args[]) {
    
        String products[] = {"Arroz", "Feijão"};
        double price[] = {21.3, 14.5};
        int method = 1;
        calculate(products, price, method, 0);

    }

    public static String calculate(String products[], double price[], int method, int splits){
    
        int i;
        double sum = 0, tributtes;
        String bill = "";
        for (i = 0; i < price.length; i++){
            sum += price[i];
        }

        if ( method == 1){ 
            //à vita, pix, cartao mastercard
            sum *= 0.8;
        }

        if (method == 2){
            //à vista crédito
            sum *= 0.9;
        }

        tributtes = sum * 0.09;

        if (method == 3 && splits > 1){
            sum /= splits;
        }

        for (i = 0; i < price.length; i++){
            bill += products[i] + ": " + String.valueOf(price[i]) + "\n";
        }
            bill += "Tributos: " + tributtes;

       return bill; 

    }
}
