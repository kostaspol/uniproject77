package com.example.konstantinospolychroniadis.onefinancialgroup;

import java.util.ArrayList;
import java.util.List;

public class PropertyInfo {

    List<String> getProperties(String type) {
        List<String> properties = new ArrayList<String>();
        if (type.equals("Select a property from the list")) {
            properties.add("Please select a property first");
        } else if (type.equals("Brussels - Property 762992-A")) {
            properties.add("Property Name: White Building");
            properties.add("Property Address: 14 High Road");
            properties.add("City: Brussels");
            properties.add("Property Value: £ 23,400,000");
        } else if (type.equals("Brussels - Property 451290-F")) {
            properties.add("Property Name: Blue Building");
            properties.add("Property Address: 34 Markland Avenue");
            properties.add("City: Brussels");
            properties.add("Property Value: £ 2,500,000");
        } else if (type.equals("London - Property 321098-A")) {
            properties.add("Property Name: Royal Court");
            properties.add("Property Address: 2 City Street");
            properties.add("City: London");
            properties.add("Property Value: £ 22,400,000");
        } else if (type.equals("London - Property 320967-S")) {
            properties.add("Property Name: Baron Court");
            properties.add("Property Address: 7 Snow Close");
            properties.add("City: London");
            properties.add("Property Value: £ 3,600,000");
        } else if (type.equals("London - Property 320986-G")) {
            properties.add("Property Name: High Street Building");
            properties.add("Property Address: 51 Circus Avenue");
            properties.add("City: London");
            properties.add("Property Value: £ 43,200,000");
        } else if (type.equals("Paris - Property 328987-W")) {
            properties.add("Property Name: Sun Bridge");
            properties.add("Property Address: 27 Garden Avenue");
            properties.add("City: Paris");
            properties.add("Property Value: £ 9,400,00");
        } else if (type.equals("Paris - Property 219976-A")) {
            properties.add("Property Name: Arch Building");
            properties.add("Property Address: 9 Central Avenue");
            properties.add("City: Paris");
            properties.add("Property Value: £ 14,900,00");
        } else {
            properties.add("Property not found");
        }
        return properties;
    }
}
