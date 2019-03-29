package H32group.H32food.repository;

import H32group.H32food.model.HangHoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("HangHoaRepository")
public interface HangHoaRepository extends JpaRepository<HangHoa, Integer> {
    HangHoa findByTen(String ten);
    Optional<HangHoa> findById(Integer id);
}
