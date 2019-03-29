package H32group.H32food.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "HoaDon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @NotEmpty
    @Column
    private long soLuong;

    @NotEmpty
    private double donGia;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    @CreationTimestamp
    private Date ngayLapHD;

//    @ManyToMany(cascade = CascadeType.REMOVE)
//    @JoinTable(name = "hoadon_hanghoa",
//            joinColumns = @JoinColumn(name = "id"),
//            inverseJoinColumns =  @JoinColumn(name = "id")
//    )
//    private Collection<HangHoa> HangHoas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }
}
