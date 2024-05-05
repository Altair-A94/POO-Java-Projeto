
package projeto_jdbc;

import java.util.Date;

public class Vendas {
    
private int id;
    private Clientes cliente;
    private Date data;

    // Construtor
    public Vendas(int id, Clientes cliente, Date data) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
    }
    
  
     // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    
}
