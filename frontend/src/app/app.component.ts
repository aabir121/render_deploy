import {Component, OnInit} from '@angular/core';
import {UserService} from "./user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'frontend';
  data : any = [];

  constructor(private userService : UserService) {

  }

  ngOnInit(): void {
    this.userService.getUsers().subscribe(( data : any)=>{
      this.data = data;
    })
  }
}
