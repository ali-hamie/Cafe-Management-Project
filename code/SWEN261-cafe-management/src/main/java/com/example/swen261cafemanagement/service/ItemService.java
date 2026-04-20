package com.example.swen261cafemanagement.service;

import com.example.swen261cafemanagement.models.Items;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final Map<Long, Items> items = new HashMap<>();
    private Long idCounter = 1L;

    public List<Items> getAllItems() {
        return new ArrayList<>(items.values());
    }

    public void addItem(String name, double price, int quantity) {
//        Items item = new Items(name, (int) price, quantity);
//        item.setId(idCounter++);
//        items.put(item.getId(), item);
    }

    public void deleteItem(Long id) {
        items.remove(id);
    }

    public Items getItem(Long id) {
        return items.get(id);
    }
}