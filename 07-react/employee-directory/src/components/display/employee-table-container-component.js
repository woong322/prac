import axios from "axios";
import React, { useEffect, useState } from "react";
import GeneralTable from "../common/general-table-component";
import EmployeeTable from "./employee-table-presentation-component";

const EmployeeDisplay = ()=>{

    const [employees, setEmployees] = useState([]);

    useEffect(()=>{
        axios
        .get("http://localhost:8082/EmployeeService/employees")
        .then((response)=>{
            console.log(response);
            setEmployees(response.data);
        })
        .catch((err)=>{
            console.error(err);
        })
    },[]);

    // return some structure (list/table) with the data we get back
    return <GeneralTable records={employees}></GeneralTable> ;

}

export default EmployeeDisplay;
