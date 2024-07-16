
package construtoresdamaquina;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class ControleCoxinha extends Maquina{
     @FXML
    private TextField quantidadetext;
     @FXML
     private TextField estoquetext;
   /*  @FXML
    private Button botaoad;
     @FXML
     private Button botaoex;
     @FXML
    private Button botaozerar;
     @FXML
     private void inciar(){
         updateEstoque();
         botaoad.setOnAction(event -> adicionar());
         botaoex.setOnAction(event -> vender());
         botaozerar.setOnAction(event -> zerar());
     }*/
    @FXML
    private void adicionar(){
        updateEstoque();
        int quantidade = Integer.parseInt(quantidadetext.getText());
        abastecer(quantidade);
        quantidadetext.clear();
    }
    @FXML
    private void vender(){
        updateEstoque();
        int quantidade=Integer.parseInt(quantidadetext.getText());
       if(quantidade>0){
        venderCoxinha(quantidade);
        quantidadetext.clear();
       }
       else{
           
       }
       
    }
    @FXML
       private void zerar(){
           updateEstoque();
           zerarMaquina();
           
       }

    private void updateEstoque() {
       estoquetext.setText(String.valueOf(getEstoque()));
    }
}
