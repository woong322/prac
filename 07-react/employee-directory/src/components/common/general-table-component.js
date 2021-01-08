import React from "react";

const GeneralTable = (props) =>{
    if(props.records && props.records.length){
        return <div>
        <table className="table">
            <thead>
                <tr>
                    {Object.keys(props.records[0]).map((objectKey, index)=>{
                        return (<th key={index}>{objectKey}</th>)
                    })}
                </tr>
            </thead>
            <tbody>
                {props.records.map((record, index)=>{
                    return (<tr key={record.id || index}>
                        {Object.keys(record).map((objectKey)=>{
                            return <td key={objectKey}> {record[objectKey]} </td>
                        })}
                    </tr>)
                })}
            </tbody>
        </table>
    </div>
    } else {
        return <span>No data to show</span>
    } 
}

export default GeneralTable;