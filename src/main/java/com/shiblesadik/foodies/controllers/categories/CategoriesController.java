package com.shiblesadik.foodies.controllers.categories;

import com.shiblesadik.foodies.models.foods.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoriesController {
//    @Autowired
//    private CategoryRepository categoryRepository;
//
//    @GetMapping("/all")
//    public String allCategories(Model model) {
//        model.addAttribute("type", "categories");
//        model.addAttribute("title", "All Categories");
//        List<Category> categories = categoryRepository.findAll();
//        model.addAttribute(categories);
//        return "categories";
//    }
//
//    @GetMapping("/view/{name}")
//    public String viewCategoryItem(@PathVariable String name, Model model) {
//        model.addAttribute("type", "view-category");
//        model.addAttribute("title", "Find - " + name);
//        Category category = categoryRepository.findByName(name);
//        model.addAttribute(category);
//        List<Category> categories = categoryRepository.findAll();
//        model.addAttribute(categories);
//        return "categories";
//    }
//
//    @GetMapping("/find/{name}")
//    public String categoryFindByName(@PathVariable String name, Model model) {
//        model.addAttribute("type", "find-categories");
//        model.addAttribute("title", name + " - View");
//        return "categories";
//    }
//
//    @GetMapping("/add")
//    public String categoryAddGetRequest(Model model) {
//        model.addAttribute("entity", new Category());
//        model.addAttribute("type", "add-category");
//        model.addAttribute("title", "Add Category");
//        model.addAttribute("modalTitle", "Add Category");
//        model.addAttribute("action", "/category/add");
//        return "categories";
//    }
//
//    @PostMapping("/add")
//    public void categoryAddPostRequest(@ModelAttribute Category category, HttpServletResponse httpServletResponse) {
//        Category nameCategory = categoryRepository.findByName(category.getName());
//        if (nameCategory == null) {
//            categoryRepository.save(category);
//            System.out.println("Category Add Success");
//            httpServletResponse.setHeader("Location", "/category/all");
//        } else {
//            System.out.println("Already this category exits");
//            httpServletResponse.setHeader("Location", "/category/add");
//        }
//        httpServletResponse.setStatus(302);
//    }
}
