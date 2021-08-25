package br.com.mota.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //      | int          | NO   | PRI | NULL    | auto_increment |
//    private BigDecimal preco;//   | decimal(6,2) | NO   |     | NULL    |                |
    private Double preco;
    private String tipo;//    | varchar(20)  | NO   |     | NULL    |                |
    private LocalDate data;//    | datetime     | NO   |     | NULL    |                |
    private String status;//  | varchar(30)  | NO   |     | NULL    |                |
    @Column(name = "user_id")
    private Long userId;// | int          | NO   | MUL | NULL    |                |

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @JsonbTransient
    public Long getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public Long getUserId() {
        return userId;
    }
}
