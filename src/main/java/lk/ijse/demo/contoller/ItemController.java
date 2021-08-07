package lk.ijse.demo.contoller;

import lk.ijse.demo.dto.ItemDTO;
import lk.ijse.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/save")
    public boolean saveItem(@RequestBody ItemDTO itemDTO) {
        return itemService.saveItem(itemDTO);
    }

}
