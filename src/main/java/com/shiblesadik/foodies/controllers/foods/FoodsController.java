package com.shiblesadik.foodies.controllers.foods;

import com.shiblesadik.foodies.models.foods.Category;
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

    @GetMapping("/category/all")
    public String allCategories(Model model) {
        model.addAttribute("type", "categories");
        model.addAttribute("title", "All Categories");
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute(categories);
        return "category";
    }

    @GetMapping("/category/view/{name}")
    public String viewCategoryItem(@PathVariable String name, Model model) {
        model.addAttribute("type", "view-category");
        model.addAttribute("title", "Find - " + name);
        return "category";
    }

    @GetMapping("/category/find/{name}")
    public String categoryByName(@PathVariable String name, Model model) {
        model.addAttribute("type", "find-categories");
        model.addAttribute("title", name + " - View");
        return "category";
    }

    @GetMapping("/category/add")
    public String getCategoryAdd(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("type", "add-category");
        model.addAttribute("title", "Add Category");
        model.addAttribute("action", "/foods/category/add");
        return "category";
    }

    @PostMapping("/category/add")
    public void postCategoryAdd(@ModelAttribute Category category, HttpServletResponse httpServletResponse) {
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
}
