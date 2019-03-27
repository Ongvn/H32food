package H32group.H32food.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
@Table(name = "HangHoa")
public class HangHoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name = "Ten")
    @NotEmpty(message = "*Khong de trong")
    private String ten;

    @Column
    @NotEmpty(message = "*Khong de trong")
    private Long soLuong;

    @Column
    private String nguon;

    @Column
    @NotEmpty(message = "*Khong de trong")
    private Double giaMua;

    @Column
    @NotEmpty(message = "*Khong de trong")
    private Double giaBan;

    @Column
    @NotEmpty(message = "*Khong de trong")
    private String loai;

//    @ManyToMany(mappedBy = "HangHoas")
//    private Collection<HoaDon> HoaDons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Long soLuong) {
        this.soLuong = soLuong;
    }

    public String getNguon() {
        return nguon;
    }

    public void setNguon(String nguon) {
        this.nguon = nguon;
    }

    public Double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Double giaMua) {
        this.giaMua = giaMua;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
