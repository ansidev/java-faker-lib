package io.github.dt_team.common.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import io.github.dt_team.common.model.BusinessCard;
import io.github.dt_team.common.model.PersonName;

/**
 * Created by ansidev on 11/5/15.
 */
public class FakerGenerator {
    private Random randomGenerator;

    public FakerGenerator() {
        randomGenerator = new Random();
    }

    public Integer integer(int min, int max) {
        return this.randomGenerator.nextInt(max - min) + min;
    }

    public String string() {
        String string = new String();
        List<String> character = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );

        for (int i = 0; i < randomGenerator.nextInt(); i++) {
            string += character.get(randomGenerator.nextInt(character.size()));
        }
        return string;
    }

    public String string(int length) {
        String string = new String();
        List<String> character = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );

        for (int i = 0; i < length; i++) {
            string += character.get(randomGenerator.nextInt(character.size()));
        }
        return string;
    }

    /**
     * Generate a random string has length in range [minLength, maxLength]
     *
     * @param minLength
     * @param maxLength
     * @return A random string has length in range [minLength, maxLength]
     */
    public String string(int minLength, int maxLength) {
        String string = new String();
        List<String> character = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );

        for (int i = 0; i < this.integer(minLength, maxLength); i++) {
            string += character.get(randomGenerator.nextInt(character.size()));
        }
        return string;
    }

    /**
     * Generate random people first name
     *
     * @return A random people first name
     */
    public String firstName() {
        List<String> firstName = Arrays.asList(
                "Nguyễn",
                "Trần",
                "Lê",
                "Hoàng",
                "Huỳnh",
                "Phan",
                "Vũ",
                "Võ",
                "Đặng",
                "Bùi",
                "Đỗ",
                "Hồ",
                "Ngô",
                "Dương",
                "Lý"
        );
        int index = randomGenerator.nextInt(firstName.size());
        return firstName.get(index);
    }

    /**
     * Generate random people middle name
     *
     * @return A random people middle name
     */
    public String middleName() {
        List<String> middleName = Arrays.asList(
                "",
                "Văn",
                "Diệu",
                "Thị",
                "Mạnh",
                "Bá",
                "Minh",
                "An",
                "Phương",
                "Xuân",
                "Hà",
                "Đức",
                "Kim",
                "Thanh",
                "Đại"
        );
        int index = randomGenerator.nextInt(middleName.size());
        return middleName.get(index);
    }

    public String lastName() {
        List<String> lastName = Arrays.asList(
                "Phúc",
                "Lộc",
                "Thọ",
                "Đoan",
                "Trang",
                "Tuyết",
                "Trinh",
                "Hiền",
                "Thương",
                "Hùng",
                "Dũng",
                "Bảo",
                "Trân",
                "Trọng",
                "Châu"
        );
        int index = randomGenerator.nextInt(lastName.size());
        return lastName.get(index);
    }

    public String name() {
        String name;
        name = this.firstName();
        if (this.middleName().equals(" ")) {
            name += " " + this.middleName();
        }
        name += " " + this.lastName();
        return name;
    }

    public String jobTitle() {
        List<String> jobTitle = Arrays.asList(
                "Giám đốc",
                "Kế toán",
                "Giáo viên",
                "Lập trình viên",
                "Giảng viên đại học",
                "Chuyên viên tư vấn tài chính",
                "Thư ký",
                "Nhân viên bán hàng",
                "Y tá",
                "Bác sĩ",
                "Kỹ sư",
                "Kiến trúc sư",
                "Nha sĩ",
                "Tổng giám đốc",
                "Chủ tịch Hội đồng quản trị"
        );
        int index = randomGenerator.nextInt(jobTitle.size());
        return jobTitle.get(index);
    }

    public String phoneNumber() {
        List<String> prefix = Arrays.asList(
                "90", "91", "93", "94", "95", "96", "97", "98", "99",
                "121", "122", "123", "124", "125", "126", "127", "128", "129",
                "162", "163", "164", "165", "166", "167", "168", "169",
                "186", "188", "199"
        );
        String phoneNumber = "+84 " + prefix.get(randomGenerator.nextInt(prefix.size())) + "";
        for (int i = 0; i < 7; i++) {
            Integer digit = randomGenerator.nextInt(9);
            phoneNumber += digit.toString();
            if (i == 3) {
                phoneNumber += " ";
            }
        }
        return phoneNumber;
    }

    public String company() {
        String companyName = this.string(10, 30);
        return companyName;
    }

    public String address() {
        String address = this.string(15, 50);
        return address;
    }

    public String domain() {
        List<String> suffixDomain = Arrays.asList(
                "com", "net", "org", "vn", "io", "info", "biz",
                "me", "asia", "mobi", "gov", "edu", "xyz"
        );
        String domain = this.string(5, 10) + ".";
        domain += suffixDomain.get(randomGenerator.nextInt(suffixDomain.size()));
        return domain;
    }

    public String email() {
        String email = this.string(5, 10) + "@" + this.domain();
        return email;
    }

    public String url() {
        List<String> protocol = Arrays.asList("http", "https");
        String url = protocol.get(randomGenerator.nextInt(protocol.size())) + "://";
        if (randomGenerator.nextInt(1) == 1) {
            url += "www.";
        }
        url += this.domain();
        return url;
    }

    public BusinessCard businessCard() {
        BusinessCard bCard = new BusinessCard();
        PersonName name = new PersonName(this.firstName(), this.middleName(), this.lastName());
        bCard.setName(name.toString());
        bCard.setJobTitle(this.jobTitle());
        bCard.setPersonName(name);
        bCard.setPhoneNumber(this.phoneNumber());
        bCard.setEmail(this.email());
        bCard.setCompany(this.company());
        bCard.setAddress(this.address());
        bCard.setWebsite(this.url());
        return bCard;
    }

}
