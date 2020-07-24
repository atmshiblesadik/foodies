package com.shiblesadik.foodies.controllers.api;

import com.shiblesadik.foodies.models.areas.Area;
import com.shiblesadik.foodies.models.areas.City;
import com.shiblesadik.foodies.repositories.areas.AreaRepository;
import com.shiblesadik.foodies.repositories.areas.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
public class LocationApi {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private AreaRepository areaRepository;

    @GetMapping("/city/all")
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @GetMapping("/city/{id}")
    public Optional<City> getCityById(@PathVariable String id) {
        return cityRepository.findById(id);
    }

    @GetMapping("/city/find/{name}")
    public List<City> findCitiesByName(@PathVariable String name) {
        return cityRepository.findAllByNameIsLike(name);
    }

    @PostMapping("/city/insert")
    public City insertCity(@RequestBody City city) {
        cityRepository.save(city);
        return city;
    }

    @GetMapping("/area/all")
    public List<Area> getAllArea() {
        return areaRepository.findAll();
    }

    @GetMapping("/area/{id}")
    public Optional<Area> getAreaById(@PathVariable String id) {
        return areaRepository.findById(id);
    }

    @GetMapping("/area/city/id/{id}")
    public List<Area> getAreasByCityId(@PathVariable String id) {
        return areaRepository.findAllByCityId(id);
    }

    @GetMapping("/area/city/name/{name}")
    public List<Area> getAreasByCityName(@PathVariable String name) {
        List<City> cityList = cityRepository.findAllByNameIsLike(name);
        List<Area> areaList = new LinkedList<>();
        for (City city: cityList) {
            List<Area> areas = areaRepository.findAllByCityId(city.getId());
            if (areas != null) {
                areaList.addAll(areas);
            }
        }
        return areaList;
    }

    @PostMapping("/area/insert")
    public Area insertArea(@RequestBody Area area) {
        areaRepository.save(area);
        return area;
    }
}
