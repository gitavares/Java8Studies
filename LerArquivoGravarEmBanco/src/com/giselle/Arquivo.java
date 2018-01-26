package com.giselle;

public class Arquivo {

    public String lerArquivo(){
        String linha = "";

        try {
            FileInputStream stream;
            stream = new FileInputStream("arquivo.txt");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (true) {
                linha = bufferedReader.readLine();
                if(linha == null)
                    break;
                try{
                    System.out.println(linha);
                }catch(NullPointerException np){
                    np.getMessage();
                }


            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
