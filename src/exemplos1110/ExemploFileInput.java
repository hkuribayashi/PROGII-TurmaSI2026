import javax.swing.JOptionPane;

void main(){

    try {
        int a = Integer.parseInt( JOptionPane.showInputDialog(null, "Informe") );
        int b = 0;
        FileInputStream fs = new FileInputStream("/Users/hugo/Desktop/teste.txt");
        System.out.println(a/b);
    }catch(FileNotFoundException e){
        System.out.println("Arquivo Não Existe");
        //Inserir o código para criar o arquivo
    }catch (ArithmeticException ae){
        JOptionPane.showMessageDialog(null, "Erro de divisao por zero");
    }

}
