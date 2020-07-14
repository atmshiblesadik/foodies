package com.shiblesadik.foodies.controllers.foods;

import com.shiblesadik.foodies.models.foods.Category;
import com.shiblesadik.foodies.models.foods.Item;
import com.shiblesadik.foodies.repository.foods.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/foods")
public class FoodsController {
    @Autowired
    private CategoryRepository categoryRepository;
//    @Autowired

    @GetMapping("/category/all")
    public String allCategories(Model model) {
        model.addAttribute("type", "categories");
        model.addAttribute("title", "All Categories");
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute(categories);
        return "list-views";
    }

    @GetMapping("/item/all")
    public String allItems(Model model) {
        model.addAttribute("type", "items");
        model.addAttribute("title", "All Foods");
        return "list-views";
    }

    @GetMapping("/category/view/{name}")
    public String viewCategoryItem(@PathVariable String name, Model model) {
        model.addAttribute("type", "view-category");
        model.addAttribute("title", "Find - " + name);
        Category category = categoryRepository.findByName(name);
        model.addAttribute(category);
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute(categories);
        return "list-views";
    }

    @GetMapping("/item/view/{id}")
    public String viewItemDetails(@PathVariable String id, Model model) {
        return "list-views";
    }

    @GetMapping("/category/find/{name}")
    public String categoryFindByName(@PathVariable String name, Model model) {
        model.addAttribute("type", "find-categories");
        model.addAttribute("title", name + " - View");
        return "list-views";
    }

    @GetMapping("/item/find/{name}")
    public String itemFindByName(@PathVariable String name, Model model) {
        return "list-views";
    }

    @GetMapping("/category/add")
    public String categoryAddGetRequest(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("type", "add-category");
        model.addAttribute("title", "Add Category");
        model.addAttribute("action", "/foods/category/add");
        return "list-views";
    }

    @GetMapping("/item/add")
    public String itemAddGetRequest(Model model) {
        return "list-views";
    }

    @PostMapping("/category/add")
    public void categoryAddPostRequest(@ModelAttribute Category category, HttpServletResponse httpServletResponse) {
        Category nameCategory = categoryRepository.findByName(category.getName());
        if (nameCategory == null) {
            categoryRepository.save(category);
            System.out.println("Category Add Success");
            httpServletResponse.setHeader("Location", "/foods/category/all");
        } else {
            System.out.println("Already this category exits");
            httpServletResponse.setHeader("Location", "/foods/category/add");
        }
        httpServletResponse.setStatus(302);
    }

    @PostMapping("/item/add")
    public String itemAddPostRequest(@ModelAttribute Item item, HttpServletResponse httpServletResponse) {
        return null;
    }
}
