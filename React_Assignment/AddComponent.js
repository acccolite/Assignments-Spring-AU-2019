import React,{Component} from 'react';
class AddComponent extends Component{
    data={}
    
    state = {
        show: false

      };
   
    onClick = () => {
                //console.log(document.getElementById("age").value);
        this.setState({show:true});
    };
    onCancel = () => {
        this.setState({show:false});
    };
    //handleChange = event => {
     //   console.log(event.target.value);
      //  this.data[event.target.id]=event.target.value;
        
        
    
   
    add =(e) => {
        e.preventDefault();
        this.data = {
            name:document.getElementById("name").value,
            lname:document.getElementById("lname").value,
            age:document.getElementById("age").value,
            Department:document.getElementById("Department").value,
            designation:document.getElementById("designation").value,
            location:document.getElementById("location").value,
        }
        console.log("data",this.data)
        
        if(this.data.age < 18)
        {
            this.setState({show:false});
            window.alert("you entered wrong value");
            
        }

        else{
            this.props.onEmpAdd(this.data);
        }



    }
    render(){
        return(
        <div>
            <button  onClick={this.onClick}>Add Employees</button>
            {
                this.state.show && (
                    <div>
                        <form>
                            Name:<input type="text" id="name" onChange={this.handleChange} />
                            Last Name:<input type="text" id="lname" onChange={this.handleChange}/>
                            Age:<input type="text" id="age" onChange={this.handleChange}/>
                            Department:<input type="text" id="Department" onChange={this.handleChange}/>
                            Designation:<input type="text" id="designation" onChange={this.handleChange}/>
                            Location:<input type="text" id="location" onChange={this.handleChange}/>
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


export default AddComponent;