package br.com.onurbasoft.entrypoint;

import br.com.onurbasoft.domain.MedicaoTemperatura;
import br.com.onurbasoft.domain.MedicaoTemperaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArduinoWebServer {

    @Autowired
    private MedicaoTemperaturaRepository medicaoTemperaturaRepository;

    @RequestMapping(path = "/medicao-temperatura", method = RequestMethod.POST)
    public void save(@RequestBody MedicaoTemperaturaDTO medicaoTemperaturaDTO){

        try {
            medicaoTemperaturaRepository.save(medicaoTemperaturaDTO.toMedicaoTemperatura());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(path = "/medicao-temperatura", method = RequestMethod.GET)
    public MedicaoTemperatura get(){
        try {
            return medicaoTemperaturaRepository.findFirstByOrderByInstanteDesc();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
