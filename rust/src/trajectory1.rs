use num_traits::Zero;
use num_bigint::BigInt;
use num_bigint::Sign;

fn trajectory1() {
    let mut x = "99123456789".parse::<BigInt>().unwrap_or_else(|_| Zero::zero());

    let t = 350;

    for _t in 0..t {
        let mut _x = BigInt::new(Sign::Plus, x.to_u32_digits().1);
        x = if _x % 2 == Zero::zero() {
            x / 2
        } else {
            x * 3 + 1
        };

        println!("{}", x);
    }
}

fn main() {
    trajectory1();
}