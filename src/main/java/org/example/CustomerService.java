package org.example;

// class extends class
// class implements interface
public class CustomerService implements CustomerServiceInterface
{
    @Override
    public void add() {
        System.out.println("CustomerService.Add");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
// Çıplak class kalmasın