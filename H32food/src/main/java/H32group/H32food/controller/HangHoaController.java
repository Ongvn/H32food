package H32group.H32food.controller;

import H32group.H32food.model.HangHoa;
import H32group.H32food.repository.HangHoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HangHoaController {
    @Autowired
    HangHoaRepository hangHoaRepository;

    @GetMapping(value = "/hanghoa")
    public Optional<HangHoa> getHangHoa(){
        return hangHoaRepository.findById(1);
    }
}
