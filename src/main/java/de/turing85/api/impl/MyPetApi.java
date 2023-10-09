package de.turing85.api.impl;

import java.io.InputStream;
import java.util.List;

import jakarta.ws.rs.core.Response;

import de.turing85.petstore.api.PetApi;
import de.turing85.petstore.model.Pet;

public class MyPetApi implements PetApi {
  @Override
  public Response addPet(Pet body) {
    return null;
  }

  @Override
  public Response deletePet(Long petId, String apiKey) {
    return null;
  }

  @Override
  public Response findPetsByStatus(List<String> status) {
    return null;
  }

  @Override
  public Response findPetsByTags(List<String> tags) {
    return null;
  }

  @Override
  public Response getPetById(Long petId) {
    return null;
  }

  @Override
  public Response updatePet(Pet body) {
    return null;
  }

  @Override
  public Response updatePetWithForm(Long petId, String name, String status) {
    return null;
  }

  @Override
  public Response uploadFile(Long petId, String additionalMetadata, InputStream fileInputStream) {
    return null;
  }
}
