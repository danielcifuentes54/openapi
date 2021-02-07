package com.dc.openapi.api;

import com.dc.openapi.api.dto.BeerRequest;
import com.dc.openapi.api.dto.BeerResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/beer")
public class BeerAPI {

    @Operation(summary = "Get all beers")
    @GetMapping("/")
    public ResponseEntity<List<BeerResponse>> findBeers() {
        return ResponseEntity.ok(Arrays.asList(BeerResponse.builder().Id(1l).name("Daniel's Beer").build()));
    }

    @Operation(summary = "Get a beer by its id")
    @GetMapping("/{id}")
    public ResponseEntity<BeerResponse> findById(@PathVariable long id) {
        return ResponseEntity.ok(BeerResponse.builder().Id(id).name("Daniel's Beer").build());
    }

    @Operation(summary = "Create a beer by its id")
    @PostMapping("/")
    public ResponseEntity<BeerResponse> createBeer(@RequestBody final BeerRequest beerRequest) {
        return ResponseEntity.ok(BeerResponse.builder().Id(1l).name(beerRequest.getName()).build());
    }

    @Operation(summary = "Delete a beer by its id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBeer(@PathVariable("id") final long id) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update a beer by its id")
    @PutMapping("/{id}")
    public ResponseEntity<BeerResponse> updateBeer(@PathVariable("id") final long id, @RequestBody final BeerRequest beerRequest) {
        return ResponseEntity.ok(BeerResponse.builder().Id(id).name(beerRequest.getName()).build());
    }

}
