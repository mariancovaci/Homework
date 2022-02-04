package siit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import siit.db.CustomerDao;
import siit.model.Customer;

import javax.validation.ValidationException;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void update(Customer customer) {
//        phone number Validation -> phone sa contina doar cifre, un anumit numar de caractere
        if (validatePhoneNumber(customer.getPhone())){
            customerDao.update(customer);
        } else {
            throw new ValidationException("Phone number not valid!");
        }
    }

    private boolean validatePhoneNumber(String phone) {
    return ((phone.startsWith("00") || phone.startsWith("+"))
            && (phone.length() >= 4));
    }


    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getBy(int id) {

        return customerDao.getBy(id);
    }
}
