//
//  ViewController.swift
//  WM HelloWorld
//
//  Created by Ahmed Ghalab on 7/4/17.
//  Copyright © 2017 WadiMakkah. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var nameTextField: UITextField!
    @IBOutlet weak var dispalyTextLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func nameChangingAction(_ sender: UITextField) {
        dispalyTextLabel.text = "Hello, \((sender.text! == "") ? "WadiMakkah" : sender.text! )!"
    }
}

