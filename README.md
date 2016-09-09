# Flat Toaster (1721 - 2016) [![Build Status](https://travis-ci.org/brennan-macaig/1721-FlatToaster.svg?branch=master)

### What is this? ###

This is the repository for FRC Team 1721's 2016 robot *Flat Toaster*. The repository is configured with Travis to automatically build all code pushed up to the repository.

I know this code is rather poorly documented, maybe I'll go through that at some point and fix it. Who really knows.

### Licensing ###

We use a NAVX-MXP expansion card for our gyro and accelerometer. A copy of the license of that project can be found [here](https://github.com/kauailabs/navxmxp/blob/master/LICENSE.txt)

All our code is also protected by the M.I.T. License. All code, unless directly noted, in this repository is protected with the following license:

```
The MIT License (MIT)

Copyright (c) 2016 Concord Robotics, Team 1721.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

### Travis-CI ###

We use Travis to automatically compile binaries of our code. This is mainly so that I can test it, NOT to auto-deploy binaries. If you want to create a binary of this project, download it and create it yourself. I am working on adding Gradle deploys to the project for next year, but in the mean time it stays as is.
