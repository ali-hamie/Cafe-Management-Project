package com.example.swen261cafemanagement.service;

import com.example.swen261cafemanagement.models.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final Map<Long, Item> items = new HashMap<>();
    private Long idCounter = 1L;

    public List<Item> getAllItems() {
        return new ArrayList<>(items.values());
    }

    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.put(item.getId(), item);
        return item;
    }

    public Item updateItem(Long id, Item updatedItem) {
        if (!items.containsKey(id)) return null;

        updatedItem.setId(id);
        items.put(id, updatedItem);
        return updatedItem;
    }

    public void deleteItem(Long id) {
        items.remove(id);
    }

    public Item getItem(Long id) {
        return items.get(id);
    }
}