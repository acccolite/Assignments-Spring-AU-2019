import React, { Component } from 'react';


class DepartmentComponent extends Component {

    constructor() {
        super();
    }


    data = {}

    state = {
        show: false

    };

    onClick = () => {

        this.setState({ show: true });
    };
    onCancel = () => {
        this.setState({ show: false });
    };
    // handleChange = event => {
    //     console.log(event.target.value);
    //     this.data[event.target.id] = event.target.value;


    // }

    add = (e) => {
        e.preventDefault();
        console.log("dept data", this.data)
        this.props.onDepAdd({
         departmentname: document.getElementById("departmentname").value   
        });


    }




        render()
        {
            return (

                <div>
                    <button onClick={this.onClick}>Add Department</button>
                    {
                        this.state.show && (
                            <div>
                                <form>
                                    Department Name:<input type="text" name="departmentname" id="departmentname" onChange={this.handleChange} />

                                    <button onClick={this.add}>Add</button>
                                    <button onClick={this.onCancel}>Cancel</button>
                                </form>
                            </div>
                        )
                    }
                </div>



            );
        }






    }

    export default DepartmentComponent;