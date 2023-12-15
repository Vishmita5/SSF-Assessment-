package vttp.ssf.assessment.eventmanagement.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participant {


    @NotEmpty
    @Size(min = 5, max = 25, message = "Full Name must be between 5 to 25 characters")
    private String fullName;


    @NotEmpty(message = "Mobile number is required")
    @Digits(fraction = 0, integer = 8, message = "Mobile number must be 8 digits")
    @Pattern(regexp = "(8|9)[0-9]{7}", message = "Invalid phone number entered")
    private Integer mobileNumber;

    
    @NotEmpty
    @Min(value = 1, message = "Minimum tickers requested must be 1")
    @Max(value = 2, message = "Maximum tickets requested is 3")
    private Integer numberOfTix;

    // required
    //  max 50 characters
    @NotEmpty(message = "Email is required")
    @Size(max=50, message=" Email exceeded 50 characters")
    @Email(message = "Invalid Email Format")
    private String email;

    // required
    @NotEmpty(message = "Gender is required")
    private String gender;

    // date must be past and not today
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Date cannot be greater than today")
    private Date birthDate;
}

